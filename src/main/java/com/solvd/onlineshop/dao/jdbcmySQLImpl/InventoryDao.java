package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IInventoryDao;
import com.solvd.onlineshop.model.product.Inventory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class InventoryDao extends BaseDao<Inventory> implements IInventoryDao {

    private static final Logger logger = LogManager.getLogger(InventoryDao.class);
    protected final static String INVENTORY_SEQUENCE = "onlinestore_inventory_seq";


    public InventoryDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO inventory (product_name, description, price, amount_in_stock VALUES (?, ?, ?, ?, ?);";

    private static final String GET_ONE = "SELECT id, product_name, description, price, amount_in_stock subtotal FROM inventory WHERE id = ?";

    private static final String UPDATE = "UPDATE inventory SET product_name = ?, description = ?, price = ?, amount_in_stock = ? FROM inventory WHERE id = ?";

    private static final String DELETE = "DELETE FROM inventory WHERE id = ?";

    @Override
    public Inventory findById(long id) {
        Inventory inventory = new Inventory();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                inventory.setId(rs.getLong("id"));
                inventory.setProductName(rs.getString("product_name"));
                inventory.setDescription(rs.getString("description"));
                inventory.setPrice(rs.getFloat("price"));
                inventory.setAmountInStock(rs.getLong("amount_in_stock"));
            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return inventory;
    }

    @Override
    public List<Inventory> findAll() {
        return null;
    }

    @Override
    public Inventory update(Inventory dto) {
        Inventory inventory = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setString(1, dto.getProductName());
            statement.setString(2, dto.getDescription());
            statement.setFloat(3, dto.getPrice());
            statement.setLong(4, dto.getAmountInStock());
            statement.setLong(5, dto.getId());
            statement.execute();
            inventory = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return inventory;
    }

    @Override
    public Inventory create(Inventory dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setString(1, dto.getProductName());
            statement.setString(2, dto.getDescription());
            statement.setFloat(3, dto.getPrice());
            statement.setLong(4, dto.getAmountInStock());
            statement.execute();
            int id = this.getLastVal(INVENTORY_SEQUENCE);
            return this.findById(id);
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(long id) {
        try(PreparedStatement statement = this.connection.prepareStatement(DELETE);) {
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public Map<String, String> productAndDescription() {
        return null;
    }

    @Override
    public Map<String, Float> productAndPrice() {
        return null;
    }

    @Override
    public Map<String, Integer> productAndAmountInStock() {
        return null;
    }
}

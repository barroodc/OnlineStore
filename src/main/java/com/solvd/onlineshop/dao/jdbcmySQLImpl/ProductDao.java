package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductDao;
import com.solvd.onlineshop.model.product.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDao extends BaseDao<Product> implements IProductDao {

    private static final Logger logger = LogManager.getLogger(ProductDao.class);
    protected final static String PRODUCT_SEQUENCE = "onlinestore_product_seq";


    public ProductDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO product (inventory_id, product_type_id, category_id, market_id, shop_id, country_id, product_name) VALUES (?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT id, inventory_id, product_type_id, category_id, market_id, shop_id, country_id, product_name FROM product_review WHERE id = ?";

    private static final String UPDATE = "UPDATE id SET inventory_id = ?, product_type_id = ?, category_id = ?, market_id = ?, shop_id = ?, country_id = ?, product_name = ? WHERE id = ?";

    private static final String DELETE = "DELETE FROM product WHERE id = ?";

    @Override
    public Product findById(long id) {
        Product product = new Product();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                product.setId(rs.getLong("id"));
                product.setInventoryID(rs.getLong("inventory_id"));
                product.setProductTypeID(rs.getLong("productType_id"));
                product.setCategoryID(rs.getLong("category_id"));
                product.setMarketID(rs.getLong("market_id"));
                product.setShopID(rs.getLong("shop_id"));
                product.setCountryID(rs.getLong("country_id"));
                product.setProductName(rs.getString("product_name"));
            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product update(Product dto) {
        Product product = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getInventoryID());
            statement.setLong(2, dto.getProductTypeID());
            statement.setLong(3, dto.getCategoryID());
            statement.setLong(4, dto.getMarketID());
            statement.setLong(5, dto.getShopID());
            statement.setLong(6, dto.getCountryID());
            statement.setString(7, dto.getProductName());
            statement.setLong(8, dto.getId());
            statement.execute();
            product = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public Product create(Product dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getInventoryID());
            statement.setLong(2,dto.getProductTypeID());
            statement.setLong(3, dto.getCategoryID());
            statement.setLong(4, dto.getMarketID());
            statement.setLong(5, dto.getShopID());
            statement.setLong(6, dto.getCountryID());
            statement.setString(7, dto.getProductName());
            statement.execute();
            int id = this.getLastVal(PRODUCT_SEQUENCE);
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
    public Product getProductName(String productName) {
        return null;
    }
}

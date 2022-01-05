package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductCategoryDao;
import com.solvd.onlineshop.model.product.ProductCategory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductCategoryDao extends BaseDao<ProductCategory> implements IProductCategoryDao {

    private static final Logger logger = LogManager.getLogger(ProductCategoryDao.class);
    protected final static String PRODUCT_CATEGORY_SEQUENCE = "onlinestore_product_category_seq";


    public ProductCategoryDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO product_category (product_id, title, meta_title, product_name) VALUES (?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT id, product_id, title, meta_title, product_name FROM product_category WHERE id = ?";

    private static final String UPDATE = "UPDATE id SET product_id = ?, title = ?, meta_title = ?, product_name = ? WHERE id = ?";

    private static final String DELETE = "DELETE FROM product_category WHERE id = ?";

    @Override
    public ProductCategory findById(long id) {
        ProductCategory productCategory = new ProductCategory();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                productCategory.setId(rs.getLong("id"));
                productCategory.setProductID(rs.getLong("product_id"));
                productCategory.setTitle(rs.getString("title"));
                productCategory.setMetaTitle(rs.getString("meta_title"));
                productCategory.setProductName(rs.getString("product_name"));
            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return productCategory;
    }

    @Override
    public List<ProductCategory> findAll() {
        return null;
    }

    @Override
    public ProductCategory update(ProductCategory dto) {
        ProductCategory productCategory = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setLong(1, dto.getProductID());
            statement.setString(2, dto.getTitle());
            statement.setString(3, dto.getMetaTitle());
            statement.setString(4, dto.getProductName());
            statement.setLong(5, dto.getId());
            statement.execute();
            productCategory = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return productCategory;
    }

    @Override
    public ProductCategory create(ProductCategory dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setLong(1, dto.getProductID());
            statement.setString(2,dto.getTitle());
            statement.setString(3, dto.getMetaTitle());
            statement.setString(4, dto.getProductName());
            statement.execute();
            int id = this.getLastVal(PRODUCT_CATEGORY_SEQUENCE);
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
    public ProductCategory getProductName(String productName) {
        return null;
    }

    @Override
    public ProductCategory getClassifications(String title, String metaTitle) {
        return null;
    }
}

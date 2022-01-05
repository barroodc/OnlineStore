package com.solvd.onlineshop.dao.jdbcmySQLImpl;

import com.solvd.onlineshop.dao.IProductReviewDao;
import com.solvd.onlineshop.model.product.ProductReview;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class ProductReviewDao extends BaseDao<ProductReview> implements IProductReviewDao {

    private static final Logger logger = LogManager.getLogger(ProductReviewDao.class);
    protected final static String PRODUCT_REVIEW_SEQUENCE = "onlinestore_product_review_seq";


    public ProductReviewDao(Connection connection) {
        super(connection);
    }

    private static final String INSERT = "INSERT INTO product_review (product_id, overall_rating, title, parent_id, time_created, user_review) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT id, product_id, overall_rating, title, parent_id, time_created, user_review FROM product_review WHERE id = ?";

    private static final String UPDATE = "UPDATE product_review SET product_id = ?, overall_rating = ?, title = ?, parent_id = ?, time_created = ? user_review = ? WHERE id = ?";

    private static final String DELETE = "DELETE FROM product_review WHERE id = ?";

    @Override
    public ProductReview findById(long id) {
        ProductReview productReview = new ProductReview();
        try(PreparedStatement statement = this.connection.prepareStatement(GET_ONE);) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                productReview.setId(rs.getLong("id"));
                productReview.setOverallRating(rs.getFloat("overall_rating"));
                productReview.setTitle(rs.getString("title"));
                productReview.setParentID(rs.getLong("parent_id"));
                productReview.setTimeCreated(rs.getDate("time_created"));
            }
        }catch (SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return productReview;
    }

    @Override
    public List<ProductReview> findAll() {
        return null;
    }

    @Override
    public ProductReview update(ProductReview dto) {
        ProductReview productReview = null;
        try(PreparedStatement statement = this.connection.prepareStatement(UPDATE);) {
            statement.setFloat(1, dto.getOverallRating());
            statement.setString(2, dto.getTitle());
            statement.setLong(3, dto.getParentID());
            statement.setDate(4,dto.getTimeCreated());
            statement.setLong(4, dto.getId());
            statement.execute();
            productReview = this.findById(dto.getId());
        }catch(SQLException e){
            logger.error(e);
            throw new RuntimeException(e);
        }
        return productReview;
    }

    @Override
    public ProductReview create(ProductReview dto) {
        try(PreparedStatement statement = this.connection.prepareStatement(INSERT);) {
            statement.setFloat(1, dto.getOverallRating());
            statement.setString(2,dto.getTitle());
            statement.setLong(3, dto.getParentID());
            statement.setDate(4, dto.getTimeCreated());
            statement.execute();
            int id = this.getLastVal(PRODUCT_REVIEW_SEQUENCE);
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
    public Map<String, Float> titleAndRating() {
        return null;
    }

    @Override
    public Map<Float, String> ratingAndUserReview() {
        return null;
    }

    @Override
    public Map<String, Date> titleAndTimeStamp() {
        return null;
    }
}

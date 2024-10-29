package com.pos.system.service.impl;

import com.pos.system.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService {

//    OrderDetailDao dao = DaoFactory.getInstance().getDao(DaoType.ORDER_DETAIL);
//    ItemDetailDao detailDao = DaoFactory.getInstance().getDao(DaoType.ITEM_DETAIL);
//    ProductDetailDao productDetailDao = DaoFactory.getInstance().getDao(DaoType.PRODUCT_DETAIL);
//
//    @Override
//    public boolean makeOrder(OrderDetailDto d) throws SQLException {
//        Connection connection = null;
//        try {
//            connection = DbConnection.getInstance().getConnection();
//            connection.setAutoCommit(false);
//            if (saveOrder(d)) {
//                boolean isItemsSaved = saveItemDetails(d.getItemDetailDto(), d.getCode());
//                if (isItemsSaved) {
//                    connection.commit();
//                    return true;
//                } else {
//                    connection.rollback();
//                    return false;
//                }
//            } else {
//                connection.rollback();
//                return false;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            connection.setAutoCommit(true);
//        }
//        return false;
//    }
//
//    public OrderDetailDto find(Integer orderId) throws SQLException, ClassNotFoundException {
//        OrderDetail orderDetail = dao.find(orderId);
//        if (orderDetail!=null) {
//            return new OrderDetailDto(
//                    orderDetail.getCode(),
//                    orderDetail.getIssuedDate(),
//                    orderDetail.getTotalCost(),
//                    orderDetail.getCustomerEmail(),
//                    orderDetail.getDiscount(),
//                    orderDetail.getOperatorEmail()
//            );
//        }
//        return null;
//    }
//    public List<OrderDetailDto> findAll() throws SQLException, ClassNotFoundException{
//        List<OrderDetailDto> dtos = new ArrayList<>();
//
//        for (OrderDetail o:dao.findAll()) {
//            dtos.add(new OrderDetailDto(
//                    o.getCode(),
//                    o.getIssuedDate(),
//                    o.getTotalCost(),
//                    o.getCustomerEmail(),
//                    o.getDiscount(),
//                    o.getOperatorEmail()
//            ));
//        }
//        return dtos;
//    }
//
//    private boolean saveOrder(OrderDetailDto dto) throws SQLException, ClassNotFoundException {
//        return dao.save(new OrderDetail(dto.getCode(), dto.getIssuedDate(), dto.getTotalCost(),dto.getCustomerEmail(), dto.getDiscount(), dto.getOperatorEmail()));
//    }
//
//    private boolean saveItemDetails(List<ItemDetailDto> list, int orderCode) throws SQLException, ClassNotFoundException {
//        for (ItemDetailDto dto : list) {
//            boolean isItemSaved = detailDao.save(
//                    new ItemDetail(dto.getDetailCode(), orderCode, dto.getQty(), dto.getDiscount(), dto.getAmount())
//            );
//            if (isItemSaved) {
//                if (!updateQty(dto.getDetailCode(), dto.getQty())) {
//                    return false;
//                }
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean updateQty(String productCode, int qty) throws SQLException, ClassNotFoundException {
//        return productDetailDao.manageQty(productCode, qty);
//    }
//    public boolean deleteOrder(Integer orderId) throws SQLException, ClassNotFoundException {
//        return dao.delete(orderId);
//    }
}

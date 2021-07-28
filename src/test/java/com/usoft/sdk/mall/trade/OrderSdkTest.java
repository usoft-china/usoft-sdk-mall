package com.usoft.sdk.mall.trade;

import com.usoft.mall.trade.external.open.api.entity.OrderDeliver;
import com.usoft.mall.trade.external.open.api.entity.OrderUpdate;
import com.usoft.mall.trade.external.open.api.protobuf.*;
import com.usoft.sdk.mall.client.trade.OrderSdk;
import com.usoft.sdk.mall.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * 
 *
 * @author CODE-GEN-GO
 */
public class OrderSdkTest {
    /**
     * 测试地址
     */
    private OrderSdk openOrderSdk = new OrderSdk("https://malltraderest.uuzcc.cn", "10050624", "c49f7be6a861461ab951e55030055a5c");
    
    @Test
    public void batchUpdateOrder() throws Exception {
        BatchUpdateOrderReq.Builder req = BatchUpdateOrderReq.newBuilder();
        OrderUpdate.Builder builder = OrderUpdate.newBuilder();
        //订单编号
        builder.setOrderCode("");
        //erp-客户或供应商enuu
        builder.setErpEnuu(0);
        req.addOrderUpdate(builder);

        BatchUpdateOrderResp resp = openOrderSdk.batchUpdateOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void deliver() throws Exception {
        DeliverReq.Builder req = DeliverReq.newBuilder();
        OrderDeliver.Builder builder = OrderDeliver.newBuilder();
        // 订单编号
        builder.setOrderCode("");
        //非必填，物流公司
        builder.setExpressInc("");
        //非必填，物流编号
        builder.setExpressCode("");
        //非必填，联系人
        builder.setContact("");
        //非必填，电话
        builder.setPhone("");
        req.addOrderDeliver(builder);
        // 个人uu 必填
        req.setUu(0);

        DeliverResp resp = openOrderSdk.deliver(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getOrderDetail() throws Exception {
        GetOrderDetailReq.Builder req = GetOrderDetailReq.newBuilder();
        // 订单编号
        req.setOrderCode("");

        GetOrderDetailResp resp = openOrderSdk.getOrderDetail(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void getOrdersByPage() throws Exception {
        GetOrdersByPageReq.Builder req = GetOrdersByPageReq.newBuilder();
        // 物料编号
        req.setMaterialCode("");
        // 数据修改时间 时间戳
        req.setUpdateTime(0);
        // 每页条数
        req.setPageSize(0);
        // 当前页码
        req.setPageNumber(0);

        GetOrdersByPageResp resp = openOrderSdk.getOrdersByPage(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void orderApplyInvoice() throws Exception {
        OrderApplyInvoiceReq.Builder req = OrderApplyInvoiceReq.newBuilder();
        // 订单编号
        req.setCode("");
        //发票code
        req.setInvoiceCode("");
        //发票寄送地址code
        req.setInvoiceAddrCode("");
        // 个人uu 必填
        req.setUu(0);

        OrderApplyInvoiceResp resp = openOrderSdk.orderApplyInvoice(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void orderEnsurePay() throws Exception {
        OrderEnsurePayReq.Builder req = OrderEnsurePayReq.newBuilder();
        // 订单编号
        req.setCode("");
        // 个人uu 必填
        req.setUu(0);

        OrderEnsurePayResp resp = openOrderSdk.orderEnsurePay(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void orderPay() throws Exception {
        OrderPayReq.Builder req = OrderPayReq.newBuilder();
        // 订单编号
        req.setCode("");
        //文件编号列表
        req.addFileCode("");
        // 个人uu 必填
        req.setUu(0);

        OrderPayResp resp = openOrderSdk.orderPay(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void orderReceive() throws Exception {
        OrderReceiveReq.Builder req = OrderReceiveReq.newBuilder();
        // 订单编号
        req.setCode("");
        // 个人uu 必填
        req.setUu(0);

        OrderReceiveResp resp = openOrderSdk.orderReceive(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void sellerBilling() throws Exception {
        SellerBillingReq.Builder req = SellerBillingReq.newBuilder();
        // 订单编号
        req.setCode("");
        // 物流公司
        req.setExpressInc("");
        // 物流单号
        req.setExpressCode("");
        // 个人uu 必填
        req.setUu(0);

        SellerBillingResp resp = openOrderSdk.sellerBilling(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void sellerFindInvoiceOrder() throws Exception {
        SellerFindInvoiceOrderReq.Builder req = SellerFindInvoiceOrderReq.newBuilder();
        // 每页条数
        req.setPageSize(0);
        // 当前页码
        req.setPageNumber(0);
        // 开票状态（142030:已开票，142020：待开票）
        req.setStatus(0);
        //搜索关键词（订单号/开票名称）
        req.setKeyword("");
        // 个人uu 必填
        req.setUu(0);

        SellerFindInvoiceOrderResp resp = openOrderSdk.sellerFindInvoiceOrder(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void sellerPageOrderList() throws Exception {
        SellerPageOrderListReq.Builder req = SellerPageOrderListReq.newBuilder();
        // 每页条数
        req.setPageSize(0);
        // 当前页码
        req.setPageNumber(0);
        // 订单状态
        req.setStatus(141010);
        //搜索关键词（订单号/买家名称/卖家名称/产品型号）
        req.setKeyword("326890");
        // 开始时间
        req.setFromDate("2020-05-15");
        // 截止时间
        req.setEndDate("");
        // 数据修改时间 时间戳
        req.setUpdateTime(1590635274000l);

        SellerPageOrderListResp resp = openOrderSdk.sellerPageOrderList(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
    @Test
    public void updatePayFile() throws Exception {
        UpdatePayFileReq.Builder req = UpdatePayFileReq.newBuilder();
        // 订单编号
        req.setCode("");
        //文件编号列表
        req.addFileCode("");
        // 个人uu 必填
        req.setUu(0);

        UpdatePayFileResp resp = openOrderSdk.updatePayFile(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
    
}
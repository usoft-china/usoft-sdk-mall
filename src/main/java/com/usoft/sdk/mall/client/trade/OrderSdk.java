package com.usoft.sdk.mall.client.trade;

import com.usoft.mall.trade.external.open.api.protobuf.*;
import com.usoft.sdk.mall.client.BaseSdk;
import com.usoft.sdk.mall.utils.HttpUtil;
import com.usoft.sdk.mall.utils.ProtoBufUtil;

import java.util.Map;

/**
 * 
 *
 * @author CODE-GEN-GO
 */
public class OrderSdk extends BaseSdk {

    public OrderSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public OrderSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
	 * 批量修改订单信息
	 *
	 * @param req
	 * @return
	 */
	public BatchUpdateOrderResp batchUpdateOrder(BatchUpdateOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/batch/update";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		BatchUpdateOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchUpdateOrderResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 订单发货
	 *
	 * @param req
	 * @return
	 */
	public DeliverResp deliver(DeliverReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/deliver";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		DeliverResp.Builder resp = ProtoBufUtil.toProtoBuf(DeliverResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 查询订单
	 *
	 * @param req
	 * @return
	 */
	public GetOrderDetailResp getOrderDetail(GetOrderDetailReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetOrderDetailResp.Builder resp = ProtoBufUtil.toProtoBuf(GetOrderDetailResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 分页查询订单列表
	 *
	 * @param req
	 * @return
	 */
	public GetOrdersByPageResp getOrdersByPage(GetOrdersByPageReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/page/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetOrdersByPageResp.Builder resp = ProtoBufUtil.toProtoBuf(GetOrdersByPageResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 申请开票
	 *
	 * @param req
	 * @return
	 */
	public OrderApplyInvoiceResp orderApplyInvoice(OrderApplyInvoiceReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/buyer/invoice";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		OrderApplyInvoiceResp.Builder resp = ProtoBufUtil.toProtoBuf(OrderApplyInvoiceResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 确认收全款
	 *
	 * @param req
	 * @return
	 */
	public OrderEnsurePayResp orderEnsurePay(OrderEnsurePayReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/ensurepay";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		OrderEnsurePayResp.Builder resp = ProtoBufUtil.toProtoBuf(OrderEnsurePayResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 上传支付凭证
	 *
	 * @param req
	 * @return
	 */
	public OrderPayResp orderPay(OrderPayReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/pay";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		OrderPayResp.Builder resp = ProtoBufUtil.toProtoBuf(OrderPayResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 确认收货
	 *
	 * @param req
	 * @return
	 */
	public OrderReceiveResp orderReceive(OrderReceiveReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/receipt";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		OrderReceiveResp.Builder resp = ProtoBufUtil.toProtoBuf(OrderReceiveResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 卖家确认开票
	 *
	 * @param req
	 * @return
	 */
	public SellerBillingResp sellerBilling(SellerBillingReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/seller/billing";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		SellerBillingResp.Builder resp = ProtoBufUtil.toProtoBuf(SellerBillingResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 卖家根据开票状态获取订单列表
	 *
	 * @param req
	 * @return
	 */
	public SellerFindInvoiceOrderResp sellerFindInvoiceOrder(SellerFindInvoiceOrderReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/seller/order/invoice/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		SellerFindInvoiceOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(SellerFindInvoiceOrderResp.newBuilder(), respJson);
		return resp.build();
	}
    
	/**
	 * 卖家分页查询订单列表
	 *
	 * @param req
	 * @return
	 */
	public SellerPageOrderListResp sellerPageOrderList(SellerPageOrderListReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/seller/list/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		SellerPageOrderListResp.Builder resp = ProtoBufUtil.toProtoBuf(SellerPageOrderListResp.newBuilder(), respJson);
		return resp.build();
	}
     
	/**
	 * 更新支付凭证
	 *
	 * @param req
	 * @return
	 */
	public UpdatePayFileResp updatePayFile(UpdatePayFileReq.Builder req) throws Exception {
		String url = baseUrl + "/openapi/trade/order/payfile/update";
		String paramJson = genSignToJson(req);
		String respJson = HttpUtil.doPost(url, paramJson, timeout);
		UpdatePayFileResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdatePayFileResp.newBuilder(), respJson);
		return resp.build();
	}
    
}

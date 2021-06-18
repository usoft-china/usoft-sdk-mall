package com.usoft.sdk.mall.client.product;

import com.usoft.mall.product.external.open.api.protobuf.*;
import com.usoft.sdk.mall.client.BaseSdk;
import com.usoft.sdk.mall.utils.HttpUtil;
import com.usoft.sdk.mall.utils.ProtoBufUtil;

import java.util.Map;

/**
 * 产品 SDK
 */
public class ProductSdk extends BaseSdk {
    public ProductSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public ProductSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
     * 分页获取产品列表
     *
     * @param req
     * @return
     */
    public GetProductsPageResp getProductsPage(GetProductsPageReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/products";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetProductsPageResp.Builder resp = ProtoBufUtil.toProtoBuf(GetProductsPageResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 获取产品详情
     *
     * @param req
     * @return
     * @throws Exception
     */
    public GetProductResp getProduct(GetProductReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/product";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetProductResp.Builder resp = ProtoBufUtil.toProtoBuf(GetProductResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 上传或修改产品
     *
     * @param req
     * @return
     */
    public AddOrUpdateProductResp addOrUpdateProduct(AddOrUpdateProductReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/save";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        AddOrUpdateProductResp.Builder resp = ProtoBufUtil.toProtoBuf(AddOrUpdateProductResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 批量上架
     *
     * @param req
     * @return
     */
    public BatchReleaseResp batchRelease(BatchReleaseReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/batchrelease";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        BatchReleaseResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchReleaseResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 批量下架
     *
     * @param req
     * @return
     */
    public BatchRevokeResp batchRevoke(BatchRevokeReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/batchrevoke";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        BatchRevokeResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchRevokeResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 批量删除产品
     *
     * @param req
     * @return
     */
    public BatchDeleteResp batchDelete(BatchDeleteReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/deleteproducts";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        BatchDeleteResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchDeleteResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 更新产品库存
     *
     * @param req
     * @return
     */
    public UpdateProductReserveResp updateProductReserve(UpdateProductReserveReq.Builder req) throws Exception {
        String url = baseUrl + "/openapi/product/reserve/update";
        String paramJson = genSignToJson(req);
        String respJson = HttpUtil.doPost(url, paramJson, timeout);
        UpdateProductReserveResp.Builder resp = ProtoBufUtil.toProtoBuf(UpdateProductReserveResp.newBuilder(), respJson);
        return resp.build();
    }

}

package com.usoft.sdk.mall.product;

import com.usoft.mall.product.external.open.api.protobuf.*;
import com.usoft.sdk.mall.client.product.ProductSdk;
import com.usoft.sdk.mall.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

public class ProductSdkTest {
    /**
     * 测试地址
     */
    private ProductSdk productSdk = new ProductSdk("https://mallproductrest.uuzcc.cn", "10050624", "c49f7be6a861461ab951e55030055a5c");

    @Test
    public void getProductsPage() throws Exception {
        GetProductsPageReq.Builder req = GetProductsPageReq.newBuilder();
        req.setPageNumber(1);
        req.setPageSize(10);
        GetProductsPageResp resp = productSdk.getProductsPage(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getProduct() throws Exception {
        GetProductReq.Builder req = GetProductReq.newBuilder();
        req.setCode("PR210609321899610556");
        GetProductResp resp = productSdk.getProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void addOrUpdateProduct() throws Exception {
        AddOrUpdateProductReq.Builder req = AddOrUpdateProductReq.newBuilder();
        req.setCode("PR190305175435487612");
        req.setUu(1000027480);
        req.setMpq(1);
        req.setMoq(1);
        req.setCategoryName("wcytest1_CategoryName");
        req.setModel("wcytest1_xh");
        AddOrUpdateProductResp resp = productSdk.addOrUpdateProduct(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void batchRelease() throws Exception {
        BatchReleaseReq.Builder req = BatchReleaseReq.newBuilder();
        req.addCode("PR190305175435487612");
        BatchReleaseResp resp = productSdk.batchRelease(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void batchRevoke() throws Exception {
        BatchRevokeReq.Builder req = BatchRevokeReq.newBuilder();
        req.addCode("PR190305175435487612");
        BatchRevokeResp resp = productSdk.batchRevoke(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void batchDelete() throws Exception {
        BatchDeleteReq.Builder req = BatchDeleteReq.newBuilder();
        BatchDeleteResp resp = productSdk.batchDelete(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void updateProductReserve() throws Exception {
        UpdateProductReserveReq.Builder req = UpdateProductReserveReq.newBuilder();
        req.setCode("PR190305175435487612");
        req.setReserve(10);
        req.setType(20);
        UpdateProductReserveResp resp = productSdk.updateProductReserve(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}

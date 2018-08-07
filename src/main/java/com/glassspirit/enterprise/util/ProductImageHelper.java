package com.glassspirit.enterprise.util;

import com.glassspirit.enterprise.constants.PageConstants;
import com.glassspirit.enterprise.model.Product;

import java.io.File;

public class ProductImageHelper {

    public static String getProductImagePath(Product product) {
        if (new File(PageConstants.PRODUCT_IMAGES + product.getId() + PageConstants.PRODUCT_IMAGES_EXTENSION).exists())
            return PageConstants.PRODUCT_IMAGES + product.getId() + PageConstants.PRODUCT_IMAGES_EXTENSION;
        else return getMissingImagePath();
    }

    public static String getMissingImagePath() {
        return PageConstants.MISSING_IMAGE_TEXTURE;
    }

}

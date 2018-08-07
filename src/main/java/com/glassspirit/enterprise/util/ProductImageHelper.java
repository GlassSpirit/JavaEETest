package com.glassspirit.enterprise.util;

import com.glassspirit.enterprise.constants.PageConstants;
import com.glassspirit.enterprise.model.Product;

import java.io.File;

public class ProductImageHelper {

    public static String getProductImagePath(Product product) {
        String filePath = PageConstants.PRODUCT_IMAGES + product.getId() + PageConstants.PRODUCT_IMAGES_EXTENSION;
        if (new File(filePath).exists())
            return filePath;
        else return getMissingImagePath();
    }

    public static String getMissingImagePath() {
        return PageConstants.MISSING_IMAGE_TEXTURE;
    }

}

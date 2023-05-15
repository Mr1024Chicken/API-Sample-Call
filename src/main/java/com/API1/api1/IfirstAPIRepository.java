package com.API1.api1;

import com.API1.api1.domain.anindoStock;
import com.API1.api1.domain.anindoStockRequestBody;

import java.util.ArrayList;

public interface IfirstAPIRepository {
    public anindoStock getStock(anindoStockRequestBody requestBody);
}

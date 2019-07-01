package com.spring.learning.customizescanning.test.service.impl;

import com.spring.learning.customizescanning.test.service.IProviderService;
import org.springframework.stereotype.Component;

/**
 * @author andyxu
 * @version V1.0
 * @Date 2019/6/20 21:04
 * @since
 */
@Component
public class ProviderServiceImpl implements IProviderService {
    @Override
    public String provider() {
        return "provider";
    }
}

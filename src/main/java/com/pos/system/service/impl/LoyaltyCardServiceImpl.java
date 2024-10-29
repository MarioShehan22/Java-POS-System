package com.pos.system.service.impl;

import com.pos.system.dto.LoyaltyCardDto;
import com.pos.system.service.LoyaltyCardService;

import java.sql.SQLException;

public class LoyaltyCardServiceImpl implements LoyaltyCardService {

    //private LoyaltyCardDao loyaltyCardDao= DaoFactory.getInstance().getDao(DaoType.LOYALTY_CARD);

    @Override
    public boolean saveLoyaltyData(LoyaltyCardDto d) throws SQLException, ClassNotFoundException {
//        return loyaltyCardDao.save(
//                new LoyaltyCard(
//                        d.getCode(),d.getCardType(),d.getBarcode(),d.getEmail()
//                )
//        );
        return false;
    }
}

package org.gec.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.gec.dao.FilminfoDao;
import org.gec.entity.Filminfo;
import org.gec.service.FilmInfoService;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Table;
import java.util.List;

import static org.springframework.transaction.annotation.Propagation.*;

@Service
@Transactional
public class FilmInfoServiceImpl implements FilmInfoService {
    @Autowired
    private FilminfoDao filminfoDao;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Filminfo> findAllInfo(Filminfo filminfo) {

        return filminfoDao.findAllFilmInfo(filminfo);
    }

    @Transactional("required")
    @Override
    public void save(Filminfo filminfo) {
        filminfoDao.save(filminfo);
    }

}

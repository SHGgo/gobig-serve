package top.gobig.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.gobig.mapper.SortMapper;
import top.gobig.pojo.Sort;
import top.gobig.service.SortService;

import java.util.List;

@Service
public class SortServiceImpl implements SortService {

    @Autowired
    SortMapper sortMapper;

    @Override
    public List<Sort> list() {
        return sortMapper.list();
    }

    @Override
    public List<Sort> list(int num) {
        return sortMapper.list(num);
    }

    @Override
    public Sort get(int id) {
        return sortMapper.get(id);
    }
}

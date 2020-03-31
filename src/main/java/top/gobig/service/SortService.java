package top.gobig.service;

import top.gobig.pojo.Sort;

import java.util.List;

public interface SortService {
    List<Sort> list();
    List<Sort> list(int num);
    Sort get(int id);
}

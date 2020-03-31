package top.gobig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gobig.service.SearchService;
import top.gobig.util.GDao;

import java.util.Map;

@RestController
@RequestMapping({"**/search"})
public class searchController {

    @Autowired
    SearchService searchService;

    /**
     *
     * @param dao {searchKeyWord , videoNum , pageStart , pageLast}
     * @return
     */
    @RequestMapping("/searchVideo")
    public Map<String, Object> searchVideo(@RequestBody GDao dao){
        System.out.println("=============searchVideo===========");
        Map<String, Object> res = searchService.searchVideo(dao);
        return res;
    }
}

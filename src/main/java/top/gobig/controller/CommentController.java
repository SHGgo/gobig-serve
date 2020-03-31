package top.gobig.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gobig.service.CommentService;
import top.gobig.util.GDao;

import java.util.Map;

@RestController
@RequestMapping("**/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    /**
     *
     * @param gDao vid commentNum pageStart
     * @return
     */
    @RequestMapping("/getVideoComment")
    public Map<Object,Object> getVideoComment(@RequestBody GDao gDao){
        System.out.println("===========getVideoComment=========");
        Map<Object, Object> videoComment = commentService.getVideoComment(gDao);
        return videoComment;
    }
}

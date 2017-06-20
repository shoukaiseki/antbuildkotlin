package org.shoukaiseki;


import java.util.ArrayList;
import java.util.List;

/**
 * TreeMenu <br>
 *
 * @author 蒋カイセキ    Japan-Tokyo  2017-06-20 14:26:40<br>
 *         ブログ http://shoukaiseki.blog.163.com/<br>
 *         E-メール jiang28555@Gmail.com<br>
 **/

public class TreeMenu {
    private String id;

    private String text;


    private List<TreeMenu> children=new ArrayList<TreeMenu>();;

    private String url;


    public TreeMenu(String id,String text,String url) {
        this.id=id;
        this.text=text;
        this.url=url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public List<TreeMenu> getChildren() {
        return children;
    }

    public void setChildren(List<TreeMenu> children) {
        this.children = children;
    }


    public TreeMenu addChildren(TreeMenu... childrens) {
        for (TreeMenu node : childrens) {
            if(children==null){
                children=new ArrayList<TreeMenu>();
            }
            children.add(node);

        }
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

(function(t){function e(e){for(var a,r,i=e[0],c=e[1],l=e[2],u=0,d=[];u<i.length;u++)r=i[u],Object.prototype.hasOwnProperty.call(s,r)&&s[r]&&d.push(s[r][0]),s[r]=0;for(a in c)Object.prototype.hasOwnProperty.call(c,a)&&(t[a]=c[a]);f&&f(e);while(d.length)d.shift()();return o.push.apply(o,l||[]),n()}function n(){for(var t,e=0;e<o.length;e++){for(var n=o[e],a=!0,r=1;r<n.length;r++){var i=n[r];0!==s[i]&&(a=!1)}a&&(o.splice(e--,1),t=c(c.s=n[0]))}return t}var a={},r={leaderBoard:0},s={leaderBoard:0},o=[];function i(t){return c.p+"static/js/"+({}[t]||t)+"-legacy."+{"chunk-3f07248a":"85ebb6c5","chunk-570bbf65":"abeb9905","chunk-579f52e4":"92d9f8a7"}[t]+".js"}function c(e){if(a[e])return a[e].exports;var n=a[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,c),n.l=!0,n.exports}c.e=function(t){var e=[],n={"chunk-570bbf65":1,"chunk-579f52e4":1};r[t]?e.push(r[t]):0!==r[t]&&n[t]&&e.push(r[t]=new Promise((function(e,n){for(var a="static/css/"+({}[t]||t)+"."+{"chunk-3f07248a":"31d6cfe0","chunk-570bbf65":"07389821","chunk-579f52e4":"d5f7695f"}[t]+".css",s=c.p+a,o=document.getElementsByTagName("link"),i=0;i<o.length;i++){var l=o[i],u=l.getAttribute("data-href")||l.getAttribute("href");if("stylesheet"===l.rel&&(u===a||u===s))return e()}var d=document.getElementsByTagName("style");for(i=0;i<d.length;i++){l=d[i],u=l.getAttribute("data-href");if(u===a||u===s)return e()}var f=document.createElement("link");f.rel="stylesheet",f.type="text/css",f.onload=e,f.onerror=function(e){var a=e&&e.target&&e.target.src||s,o=new Error("Loading CSS chunk "+t+" failed.\n("+a+")");o.code="CSS_CHUNK_LOAD_FAILED",o.request=a,delete r[t],f.parentNode.removeChild(f),n(o)},f.href=s;var p=document.getElementsByTagName("head")[0];p.appendChild(f)})).then((function(){r[t]=0})));var a=s[t];if(0!==a)if(a)e.push(a[2]);else{var o=new Promise((function(e,n){a=s[t]=[e,n]}));e.push(a[2]=o);var l,u=document.createElement("script");u.charset="utf-8",u.timeout=120,c.nc&&u.setAttribute("nonce",c.nc),u.src=i(t);var d=new Error;l=function(e){u.onerror=u.onload=null,clearTimeout(f);var n=s[t];if(0!==n){if(n){var a=e&&("load"===e.type?"missing":e.type),r=e&&e.target&&e.target.src;d.message="Loading chunk "+t+" failed.\n("+a+": "+r+")",d.name="ChunkLoadError",d.type=a,d.request=r,n[1](d)}s[t]=void 0}};var f=setTimeout((function(){l({type:"timeout",target:u})}),12e4);u.onerror=u.onload=l,document.head.appendChild(u)}return Promise.all(e)},c.m=t,c.c=a,c.d=function(t,e,n){c.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},c.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},c.t=function(t,e){if(1&e&&(t=c(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(c.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)c.d(n,a,function(e){return t[e]}.bind(null,a));return n},c.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return c.d(e,"a",e),e},c.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},c.p="/",c.oe=function(t){throw console.error(t),t};var l=window["webpackJsonp"]=window["webpackJsonp"]||[],u=l.push.bind(l);l.push=e,l=l.slice();for(var d=0;d<l.length;d++)e(l[d]);var f=u;o.push([1,"chunk-vendors","chunk-common"]),n()})({1:function(t,e,n){t.exports=n("2c50")},"2c50":function(t,e,n){"use strict";n.r(e);n("e260"),n("e6cf"),n("cca6"),n("a79d");var a=n("2b0e"),r=n("2f62");a["a"].use(r["a"]);var s={path:"",userContent:{}},o={},i={},c=new r["a"].Store({state:s,mutations:o,actions:i}),l=(n("be3b"),n("16b4"),n("e5b4"),n("fd31"),function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("top"),n("middle")],1)}),u=[],d=n("1f31"),f=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"container",attrs:{id:"lb-middle"}},[n("section",{staticClass:"topTitle d-flex justify-content-center align-items-center"},[t._v("排行榜")]),t._m(0),n("section",{staticClass:"mt-4",attrs:{id:"long-show-box-list"}},[n("ul",t._l(t.videoList,(function(e,a){return n("li",{staticClass:"row"},[n("a",{staticClass:"long-show-box d-flex pb-3 pt-3",attrs:{href:t.playUrlPre+e.vid}},[n("div",{staticClass:"num d-none d-lg-flex col-1 justify-content-center align-items-center"},[n("span",[t._v(" "+t._s(a+1)+" ")])]),n("div",{staticClass:"col-5 col-md-3 col-xl-2"},[n("a",{staticClass:"d-flex g-img-link",attrs:{href:t.playUrlPre+e.vid}},[n("img",{staticClass:"img-fluid",attrs:{src:e.pic,alt:""}})])]),n("div",{staticClass:"middle d-flex flex-column justify-content-between mt-1 col col-xl-6"},[n("div",{staticClass:"row align-items-center"},[n("a",{staticClass:"title col",attrs:{href:t.playUrlPre+e.vid}},[t._v(" "+t._s(e.title)+" ")])]),n("div",{staticClass:"bottom row no-gutters align-items-center"},[n("p",{staticClass:"view"},[n("span",{staticClass:"fa fa-play-circle-o"}),t._v(" "+t._s(e.viewCount)+" ")]),n("p",{staticClass:"comment"},[n("span",{staticClass:"fa fa-comment-o"}),t._v(" "+t._s(e.commentCount)+" ")]),n("p",{staticClass:"collect d-none d-xl-block"},[n("span",{staticClass:"fa fa-pencil-square-o"}),t._v(" "+t._s(e.collectCount)+" ")])])]),n("div",{staticClass:"vscore d-none d-lg-flex  col-3 justify-content-end align-items-center"},[n("div",{staticClass:"d-flex flex-column align-items-center"},[n("span",{staticClass:"score"},[t._v(t._s(e.vscore))]),n("small",{staticClass:"text text-secondary font-weight-light"},[t._v("综合得分")])])])])])})),0)])])},p=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("section",{staticClass:"row mt-2 justify-content-between"},[n("div",{staticClass:"d-flex col-12"},[n("nav",{staticClass:"nav nav-pills"},[n("a",{staticClass:"nav-link active",attrs:{href:"#"}},[t._v("投稿时间排序")]),n("a",{staticClass:"nav-link",attrs:{href:"#"}},[t._v("视频热度排序")])]),n("div",{staticClass:"dropdown"},[n("button",{staticClass:"btn btn-secondary dropdown-toggle",attrs:{type:"button","data-toggle":"dropdown"}},[t._v(" 播放数 ")]),n("div",{staticClass:"dropdown-menu"},[n("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("评论数")]),n("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("点赞数")]),n("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("收藏数")])])])])])}],v=n("2f14"),m=50,h={name:"middle",data:function(){return{playUrlPre:v["b"].playUrlPre,personalSpaceUrlPre:v["b"].personalSpaceUrlPre,videoList:[]}},created:function(){this.getVideoList()},methods:{getVideoList:function(){var t=this,e={videoNum:m};axios({method:"post",url:"video/getScoreVideoList",data:e,headers:{"Content-Type":"application/json; charset=utf-8"}}).then((function(e){var n=e.data;t.videoList=n.videoList})).catch((function(t){console.log(t)}))}}},g=h,b=(n("6ffd"),n("2877")),C=Object(b["a"])(g,f,p,!1,null,"03fba216",null),y=C.exports,_={name:"App",components:{top:d["a"],middle:y}},w=_,x=(n("dd1b"),Object(b["a"])(w,l,u,!1,null,"204c4eaf",null)),k=x.exports;a["a"].config.productionTip=!1,new a["a"]({store:c,render:function(t){return t(k)}}).$mount("#app")},"6ffd":function(t,e,n){"use strict";var a=n("ed5e"),r=n.n(a);r.a},ed5e:function(t,e,n){}});
(function(t){function e(e){for(var a,r,i=e[0],l=e[1],c=e[2],d=0,u=[];d<i.length;d++)r=i[d],Object.prototype.hasOwnProperty.call(s,r)&&s[r]&&u.push(s[r][0]),s[r]=0;for(a in l)Object.prototype.hasOwnProperty.call(l,a)&&(t[a]=l[a]);f&&f(e);while(u.length)u.shift()();return o.push.apply(o,c||[]),n()}function n(){for(var t,e=0;e<o.length;e++){for(var n=o[e],a=!0,r=1;r<n.length;r++){var i=n[r];0!==s[i]&&(a=!1)}a&&(o.splice(e--,1),t=l(l.s=n[0]))}return t}var a={},r={leaderBoard:0},s={leaderBoard:0},o=[];function i(t){return l.p+"static/js/"+({}[t]||t)+"."+{"chunk-20df334f":"063199d4","chunk-570bbf65":"42323924","chunk-e54ebf30":"d23281a7"}[t]+".js"}function l(e){if(a[e])return a[e].exports;var n=a[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,l),n.l=!0,n.exports}l.e=function(t){var e=[],n={"chunk-570bbf65":1,"chunk-e54ebf30":1};r[t]?e.push(r[t]):0!==r[t]&&n[t]&&e.push(r[t]=new Promise((function(e,n){for(var a="static/css/"+({}[t]||t)+"."+{"chunk-20df334f":"31d6cfe0","chunk-570bbf65":"07389821","chunk-e54ebf30":"7fb4f779"}[t]+".css",s=l.p+a,o=document.getElementsByTagName("link"),i=0;i<o.length;i++){var c=o[i],d=c.getAttribute("data-href")||c.getAttribute("href");if("stylesheet"===c.rel&&(d===a||d===s))return e()}var u=document.getElementsByTagName("style");for(i=0;i<u.length;i++){c=u[i],d=c.getAttribute("data-href");if(d===a||d===s)return e()}var f=document.createElement("link");f.rel="stylesheet",f.type="text/css",f.onload=e,f.onerror=function(e){var a=e&&e.target&&e.target.src||s,o=new Error("Loading CSS chunk "+t+" failed.\n("+a+")");o.code="CSS_CHUNK_LOAD_FAILED",o.request=a,delete r[t],f.parentNode.removeChild(f),n(o)},f.href=s;var p=document.getElementsByTagName("head")[0];p.appendChild(f)})).then((function(){r[t]=0})));var a=s[t];if(0!==a)if(a)e.push(a[2]);else{var o=new Promise((function(e,n){a=s[t]=[e,n]}));e.push(a[2]=o);var c,d=document.createElement("script");d.charset="utf-8",d.timeout=120,l.nc&&d.setAttribute("nonce",l.nc),d.src=i(t);var u=new Error;c=function(e){d.onerror=d.onload=null,clearTimeout(f);var n=s[t];if(0!==n){if(n){var a=e&&("load"===e.type?"missing":e.type),r=e&&e.target&&e.target.src;u.message="Loading chunk "+t+" failed.\n("+a+": "+r+")",u.name="ChunkLoadError",u.type=a,u.request=r,n[1](u)}s[t]=void 0}};var f=setTimeout((function(){c({type:"timeout",target:d})}),12e4);d.onerror=d.onload=c,document.head.appendChild(d)}return Promise.all(e)},l.m=t,l.c=a,l.d=function(t,e,n){l.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},l.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},l.t=function(t,e){if(1&e&&(t=l(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(l.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)l.d(n,a,function(e){return t[e]}.bind(null,a));return n},l.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return l.d(e,"a",e),e},l.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},l.p="/",l.oe=function(t){throw console.error(t),t};var c=window["webpackJsonp"]=window["webpackJsonp"]||[],d=c.push.bind(c);c.push=e,c=c.slice();for(var u=0;u<c.length;u++)e(c[u]);var f=d;o.push([1,"chunk-vendors","chunk-common"]),n()})({1:function(t,e,n){t.exports=n("2c50")},"2c50":function(t,e,n){"use strict";n.r(e);var a=n("2b0e"),r=n("2f62");a["a"].use(r["a"]);var s={path:"",userContent:{}},o={},i={},l=new r["a"].Store({state:s,mutations:o,actions:i}),c=(n("be3b"),n("16b4"),n("e5b4"),n("fd31"),function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("top"),n("middle")],1)}),d=[],u=n("1f31"),f=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"container",attrs:{id:"lb-middle"}},[n("section",{staticClass:"topTitle d-flex justify-content-center align-items-center"},[t._v("排行榜")]),t._m(0),n("section",{staticClass:"mt-4",attrs:{id:"long-show-box-list"}},[n("ul",t._l(t.videoList,(function(e,a){return n("li",{staticClass:"row"},[n("a",{staticClass:"long-show-box d-flex pb-3 pt-3",attrs:{href:t.playUrlPre+e.vid}},[n("div",{staticClass:"num d-none d-lg-flex col-1 justify-content-center align-items-center"},[n("span",[t._v(" "+t._s(a+1)+" ")])]),n("div",{staticClass:"col-5 col-md-3 col-xl-2"},[n("a",{staticClass:"d-flex g-img-link",attrs:{href:t.playUrlPre+e.vid}},[n("img",{staticClass:"img-fluid",attrs:{src:e.pic,alt:""}})])]),n("div",{staticClass:"middle d-flex flex-column justify-content-between mt-1 col col-xl-6"},[n("div",{staticClass:"row align-items-center"},[n("a",{staticClass:"title col",attrs:{href:t.playUrlPre+e.vid}},[t._v(" "+t._s(e.title)+" ")])]),n("div",{staticClass:"bottom row no-gutters align-items-center"},[n("p",{staticClass:"view"},[n("span",{staticClass:"fa fa-play-circle-o"}),t._v(" "+t._s(e.viewCount)+" ")]),n("p",{staticClass:"comment"},[n("span",{staticClass:"fa fa-comment-o"}),t._v(" "+t._s(e.commentCount)+" ")]),n("p",{staticClass:"collect d-none d-xl-block"},[n("span",{staticClass:"fa fa-pencil-square-o"}),t._v(" "+t._s(e.collectCount)+" ")])])]),n("div",{staticClass:"vscore d-none d-lg-flex  col-3 justify-content-end align-items-center"},[n("div",{staticClass:"d-flex flex-column align-items-center"},[n("span",{staticClass:"score"},[t._v(t._s(e.vscore))]),n("small",{staticClass:"text text-secondary font-weight-light"},[t._v("综合得分")])])])])])})),0)])])},p=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("section",{staticClass:"row mt-2 justify-content-between"},[n("div",{staticClass:"d-flex col-12"},[n("nav",{staticClass:"nav nav-pills"},[n("a",{staticClass:"nav-link active",attrs:{href:"#"}},[t._v("投稿时间排序")]),n("a",{staticClass:"nav-link",attrs:{href:"#"}},[t._v("视频热度排序")])]),n("div",{staticClass:"dropdown"},[n("button",{staticClass:"btn btn-secondary dropdown-toggle",attrs:{type:"button","data-toggle":"dropdown"}},[t._v(" 播放数 ")]),n("div",{staticClass:"dropdown-menu"},[n("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("评论数")]),n("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("点赞数")]),n("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("收藏数")])])])])])}],v=n("2f14"),m=50,h={name:"middle",data(){return{playUrlPre:v["b"].playUrlPre,personalSpaceUrlPre:v["b"].personalSpaceUrlPre,videoList:[]}},created(){this.getVideoList()},methods:{getVideoList(){var t={videoNum:m};axios({method:"post",url:"video/getScoreVideoList",data:t,headers:{"Content-Type":"application/json; charset=utf-8"}}).then(t=>{var e=t.data;this.videoList=e.videoList}).catch((function(t){console.log(t)}))}}},g=h,b=(n("6ffd"),n("2877")),C=Object(b["a"])(g,f,p,!1,null,"03fba216",null),y=C.exports,_={name:"App",components:{top:u["a"],middle:y}},w=_,x=(n("dd1b"),Object(b["a"])(w,c,d,!1,null,"204c4eaf",null)),k=x.exports;a["a"].config.productionTip=!1,new a["a"]({store:l,render:t=>t(k)}).$mount("#app")},"6ffd":function(t,e,n){"use strict";var a=n("ed5e"),r=n.n(a);r.a},ed5e:function(t,e,n){}});
(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-common","chunk-e54ebf30"],{"079b":function(t,e,a){},"16b4":function(t,e,a){},"1f31":function(t,e,a){"use strict";var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("header",[t.smTop?a("sm-top"):a("lg-top")],1)},s=[],n=(a("e6cf"),{name:"top",data(){return{smTop:{}}},components:{"lg-top":()=>Promise.all([a.e("chunk-20df334f"),a.e("chunk-570bbf65")]).then(a.bind(null,"b7a5")),"sm-top":()=>Promise.all([a.e("chunk-20df334f"),a.e("chunk-e54ebf30")]).then(a.bind(null,"b7a8"))},created(){this.resizeData()},methods:{resizeData(){this.smTop=window.screen.width<576}}}),i=n,o=(a("c747"),a("2877")),l=Object(o["a"])(i,r,s,!1,null,"074ca767",null);e["a"]=l.exports},"24ce":function(t,e,a){},"2f14":function(t,e,a){"use strict";a.d(e,"a",(function(){return s})),a.d(e,"b",(function(){return r}));a("25f0"),a("5319");var r={indexUrlPre:"/index.html#/",sortUrlPre:"/index.html#/sort/",searchUrlPre:"/search.html#/",playUrlPre:"/pac.html#/",userManageUrlPre:"/um.html#/",personalSpaceUrlPre:"/ps.html#/",userLoginUrlPre:"/ular.html#/",userRegisterUrlPre:"/ular.html#/ur",leaderBoardUrlPre:"/lb.html#/",sorry:"/sorry.html#/"};function s(t,e){function a(t){return t=t.toString(),t[1]?t:"0"+t}var r=["Y","M","D","h","m","s"],s=[],n=new Date(t);for(var i in s.push(n.getFullYear()),s.push(a(n.getMonth()+1)),s.push(a(n.getDate())),s.push(a(n.getHours())),s.push(a(n.getMinutes())),s.push(a(n.getSeconds())),s)e=e.replace(r[i],s[i]);return e}},"4ffd":function(t,e,a){t.exports=a.p+"static/img/logo.f03db12d.png"},"520f":function(t,e,a){},"584a":function(t,e,a){"use strict";var r=a("7d3d"),s=a.n(r);s.a},"5d83":function(t,e,a){},"7d3d":function(t,e,a){},"7fa3":function(t,e,a){"use strict";var r=a("5d83"),s=a.n(r);s.a},a2f9:function(t,e,a){t.exports=a.p+"static/img/telegram.445d2655.png"},a3c7:function(t,e,a){"use strict";var r=a("d781"),s=a.n(r);s.a},a95a:function(t,e,a){"use strict";var r=a("520f"),s=a.n(r);s.a},b7a8:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("section",{attrs:{id:"smTop"}},[r("div",{staticClass:"topNav container-fluid box-shadow"},[r("nav",{staticClass:"navbar row navbar-expand-lg navbar-light bg-white ss"},[r("div",{staticClass:"navbar-brand col-4"},[r("a",{staticClass:"d-flex align-items-center",staticStyle:{width:"6rem"},attrs:{href:t.indexUrlPre}},[r("img",{staticClass:"img-fluid",attrs:{src:a("4ffd"),alt:""}})])]),t._m(0),r("div",{staticClass:"collapse navbar-collapse col",attrs:{id:"navbarSupportedContent"}},[r("div",{staticClass:"row no-gutters w-100"},[r("div",{staticClass:"col"},[r("form",{staticClass:"row no-gutters justify-content-center align-items-center",attrs:{action:t.searchUrlPre}},[r("div",{staticClass:"searchBar col-8"},[r("input",{directives:[{name:"model",rawName:"v-model.lazy",value:t.keyWord,expression:"keyWord",modifiers:{lazy:!0}}],staticClass:"form-control",attrs:{type:"text",title:"你想要什么？",name:"keyWord"},domProps:{value:t.keyWord},on:{keyup:function(e){return!e.type.indexOf("key")&&t._k(e.keyCode,"enter",13,e.key,"Enter")?null:t.toSearch(t.keyWord)},change:function(e){t.keyWord=e.target.value}}})]),r("button",{staticClass:"btn btn-info col-3 col-xl-2",on:{click:function(e){return t.toSearch(t.keyWord)}}},[r("i",{staticClass:"fa fa-search"})])])]),t.login?r("div",{staticClass:"col-6 d-flex justify-content-end"},[r("div",{staticClass:"row no-gutters align-items-center justify-content-end mr-2"},[r("a",{staticClass:"d-flex mx-3",staticStyle:{width:"2.5rem",height:"2.5rem"},attrs:{target:"_blank",href:t.userManageUrlPre}},[r("img",{staticClass:"rounded-circle img-fluid ",attrs:{src:t.user.figure,alt:""}})]),r("a",{staticClass:"mx-3",attrs:{href:t.personalSpaceUrlPre+t.user.uid,target:"_blank"}},[t._v("个人空间")])])]):r("div",{staticClass:"col-6 d-flex justify-content-end"},[r("div",{staticClass:"row no-gutters align-items-center justify-content-end mr-3"},[r("a",{staticClass:"d-flex",staticStyle:{width:"2rem",height:"2rem"},attrs:{href:t.userLogin}},[r("img",{staticClass:"img-fluid",attrs:{src:a("a2f9"),alt:""}})]),r("a",{staticClass:"login font-weight-bolder ml-3",attrs:{href:t.userLogin}},[t._v("登录")]),r("a",{staticClass:"register font-weight-bolder ml-3",attrs:{href:t.userRegister}},[t._v("注册")])])])])])])]),r("div",{staticClass:"height"})])},s=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("button",{staticClass:"navbar-toggler",attrs:{type:"button","data-toggle":"collapse","data-target":"#navbarSupportedContent"}},[a("span",{staticClass:"navbar-toggler-icon"})])}],n=a("2f14"),i={name:"smTop",data(){return{indexUrlPre:n["b"].indexUrlPre,searchUrlPre:n["b"].searchUrlPre,personalSpaceUrlPre:n["b"].personalSpaceUrlPre,userManageUrlPre:n["b"].userManageUrlPre,userLogin:n["b"].userLoginUrlPre,userRegister:n["b"].userRegisterUrlPre,user:{},login:!1,keyWord:""}},created(){this.userConditionCheck()},methods:{toSearch(t){window.location=this.searchUrlPre+t},getUserContent(){var t={num:0};axios({method:"post",url:"user/getUserContent",data:t,headers:{Authorization:localStorage.getItem("token"),"Content-Type":"application/json; charset=utf-8"}}).then(t=>{t.data?(this.user=t.data,this.$store.state.userContent=t.data,this.login=!0):(this.login=!1,alert("登录失败，请重新登录"),window.location=this.userLogin)}).catch((function(t){console.log(t)}))},userConditionCheck(){localStorage.getItem("token")?axios({method:"post",url:"user/userConditionCheck",headers:{Authorization:localStorage.getItem("token"),"Content-Type":"application/json; charset=utf-8"}}).then(t=>{"200"===t.data.status?this.getUserContent():this.login=!1}).catch((function(t){console.log(t)})):this.login=!1}}},o=i,l=(a("a95a"),a("7fa3"),a("2877")),c=Object(l["a"])(o,r,s,!1,null,"1322785e",null);e["default"]=c.exports},be3b:function(t,e,a){"use strict";a("e6cf");var r=a("2b0e"),s=a("f753"),n=a.n(s);n.a.defaults.baseURL="/";var i={},o=n.a.create(i);o.interceptors.request.use((function(t){return t}),(function(t){return Promise.reject(t)})),o.interceptors.response.use((function(t){return t}),(function(t){return Promise.reject(t)})),Plugin.install=function(t,e){t.axios=o,window.axios=o,Object.defineProperties(t.prototype,{axios:{get(){return o}},$axios:{get(){return o}}})},r["a"].use(Plugin);Plugin},c747:function(t,e,a){"use strict";var r=a("24ce"),s=a.n(r);s.a},d781:function(t,e,a){},dd1b:function(t,e,a){"use strict";var r=a("fec8"),s=a.n(r);s.a},e5b4:function(t,e,a){},e88e:function(t,e,a){"use strict";var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"show-box"},[a("a",{staticClass:"pic",attrs:{target:"_blank",href:t.playUrlPre+t.data.vid}},[a("img",{staticClass:"img-fluid",attrs:{src:t.data.pic,alt:""}}),a("div",{staticClass:"count"},[a("span",{staticClass:"viewCount"},[a("i",{staticClass:"fa fa-youtube-play"}),t._v(" "+t._s(t.data.viewCount)+" ")]),a("span",{staticClass:"commentCount"},[a("i",{staticClass:"fa fa-thumbs-o-up"}),t._v(" "+t._s(t.data.commentCount)+" ")])]),a("div",{staticClass:"shade"})]),a("a",{staticClass:"title",attrs:{target:"_blank",href:t.playUrlPre+t.data.vid}},[a("span",[t._v(t._s(t.data.title))])]),a("a",{staticClass:"author",attrs:{target:"_blank",href:t.personalSpaceUrlPre+t.data.uid}},[a("span",{staticClass:"fa fa-user-o"}),t._v(" "+t._s(t.data.author)+" ")])])},s=[],n=a("2f14"),i={name:"showBox",props:["data"],data(){return{playUrlPre:n["b"].playUrlPre,personalSpaceUrlPre:n["b"].personalSpaceUrlPre}}},o=i,l=(a("f993"),a("2877")),c=Object(l["a"])(o,r,s,!1,null,"5f307296",null);e["a"]=c.exports},f993:function(t,e,a){"use strict";var r=a("079b"),s=a.n(r);s.a},fec8:function(t,e,a){}}]);
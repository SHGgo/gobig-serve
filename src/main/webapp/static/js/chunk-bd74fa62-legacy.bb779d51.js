(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-bd74fa62"],{"057f":function(t,e,r){var n=r("fc6a"),a=r("241c").f,i={}.toString,s="object"==typeof window&&window&&Object.getOwnPropertyNames?Object.getOwnPropertyNames(window):[],o=function(t){try{return a(t)}catch(e){return s.slice()}};t.exports.f=function(t){return s&&"[object Window]"==i.call(t)?o(t):a(n(t))}},"14c3":function(t,e,r){var n=r("c6b6"),a=r("9263");t.exports=function(t,e){var r=t.exec;if("function"===typeof r){var i=r.call(t,e);if("object"!==typeof i)throw TypeError("RegExp exec method returned something other than an Object or null");return i}if("RegExp"!==n(t))throw TypeError("RegExp#exec called on incompatible receiver");return a.call(t,e)}},"25f0":function(t,e,r){"use strict";var n=r("6eeb"),a=r("825a"),i=r("d039"),s=r("ad6d"),o="toString",c=RegExp.prototype,l=c[o],u=i((function(){return"/a/b"!=l.call({source:"a",flags:"b"})})),f=l.name!=o;(u||f)&&n(RegExp.prototype,o,(function(){var t=a(this),e=String(t.source),r=t.flags,n=String(void 0===r&&t instanceof RegExp&&!("flags"in c)?s.call(t):r);return"/"+e+"/"+n}),{unsafe:!0})},"2f14":function(t,e,r){"use strict";r.d(e,"a",(function(){return a})),r.d(e,"b",(function(){return n}));r("d3b7"),r("ac1f"),r("25f0"),r("5319");var n={indexUrlPre:"/index.html#/",sortUrlPre:"/index.html#/sort/",searchUrlPre:"/search.html#/",playUrlPre:"/pac.html#/",userManageUrlPre:"/um.html#/",personalSpaceUrlPre:"/ps.html#/",userLoginUrlPre:"/ular.html#/",userRegisterUrlPre:"/ular.html#/ur",leaderBoardUrlPre:"/lb.html#/",sorry:"/sorry.html#/"};function a(t,e){function r(t){return t=t.toString(),t[1]?t:"0"+t}var n=["Y","M","D","h","m","s"],a=[],i=new Date(t);for(var s in a.push(i.getFullYear()),a.push(r(i.getMonth()+1)),a.push(r(i.getDate())),a.push(r(i.getHours())),a.push(r(i.getMinutes())),a.push(r(i.getSeconds())),a)e=e.replace(n[s],a[s]);return e}},"3ca3":function(t,e,r){"use strict";var n=r("6547").charAt,a=r("69f3"),i=r("7dd0"),s="String Iterator",o=a.set,c=a.getterFor(s);i(String,"String",(function(t){o(this,{type:s,string:String(t),index:0})}),(function(){var t,e=c(this),r=e.string,a=e.index;return a>=r.length?{value:void 0,done:!0}:(t=n(r,a),e.index+=t.length,{value:t,done:!1})}))},5319:function(t,e,r){"use strict";var n=r("d784"),a=r("825a"),i=r("7b0b"),s=r("50c4"),o=r("a691"),c=r("1d80"),l=r("8aa5"),u=r("14c3"),f=Math.max,d=Math.min,p=Math.floor,v=/\$([$&'`]|\d\d?|<[^>]*>)/g,g=/\$([$&'`]|\d\d?)/g,h=function(t){return void 0===t?t:String(t)};n("replace",2,(function(t,e,r,n){var m=n.REGEXP_REPLACE_SUBSTITUTES_UNDEFINED_CAPTURE,b=n.REPLACE_KEEPS_$0,y=m?"$":"$0";return[function(r,n){var a=c(this),i=void 0==r?void 0:r[t];return void 0!==i?i.call(r,a,n):e.call(String(a),r,n)},function(t,n){if(!m&&b||"string"===typeof n&&-1===n.indexOf(y)){var i=r(e,t,this,n);if(i.done)return i.value}var c=a(t),p=String(this),v="function"===typeof n;v||(n=String(n));var g=c.global;if(g){var S=c.unicode;c.lastIndex=0}var C=[];while(1){var L=u(c,p);if(null===L)break;if(C.push(L),!g)break;var P=String(L[0]);""===P&&(c.lastIndex=l(p,s(c.lastIndex),S))}for(var w="",E=0,N=0;N<C.length;N++){L=C[N];for(var _=String(L[0]),k=f(d(o(L.index),p.length),0),T=[],R=1;R<L.length;R++)T.push(h(L[R]));var A=L.groups;if(v){var O=[_].concat(T,k,p);void 0!==A&&O.push(A);var U=String(n.apply(void 0,O))}else U=x(_,p,k,T,A,n);k>=E&&(w+=p.slice(E,k)+U,E=k+_.length)}return w+p.slice(E)}];function x(t,r,n,a,s,o){var c=n+t.length,l=a.length,u=g;return void 0!==s&&(s=i(s),u=v),e.call(o,u,(function(e,i){var o;switch(i.charAt(0)){case"$":return"$";case"&":return t;case"`":return r.slice(0,n);case"'":return r.slice(c);case"<":o=s[i.slice(1,-1)];break;default:var u=+i;if(0===u)return e;if(u>l){var f=p(u/10);return 0===f?e:f<=l?void 0===a[f-1]?i.charAt(1):a[f-1]+i.charAt(1):e}o=a[u-1]}return void 0===o?"":o}))}}))},"5d9a":function(t,e,r){"use strict";var n=r("e1d9"),a=r.n(n);a.a},6547:function(t,e,r){var n=r("a691"),a=r("1d80"),i=function(t){return function(e,r){var i,s,o=String(a(e)),c=n(r),l=o.length;return c<0||c>=l?t?"":void 0:(i=o.charCodeAt(c),i<55296||i>56319||c+1===l||(s=o.charCodeAt(c+1))<56320||s>57343?t?o.charAt(c):i:t?o.slice(c,c+2):s-56320+(i-55296<<10)+65536)}};t.exports={codeAt:i(!1),charAt:i(!0)}},"65f0":function(t,e,r){var n=r("861d"),a=r("e8b5"),i=r("b622"),s=i("species");t.exports=function(t,e){var r;return a(t)&&(r=t.constructor,"function"!=typeof r||r!==Array&&!a(r.prototype)?n(r)&&(r=r[s],null===r&&(r=void 0)):r=void 0),new(void 0===r?Array:r)(0===e?0:e)}},"746f":function(t,e,r){var n=r("428f"),a=r("5135"),i=r("e538"),s=r("9bf2").f;t.exports=function(t){var e=n.Symbol||(n.Symbol={});a(e,t)||s(e,t,{value:i.f(t)})}},"8aa5":function(t,e,r){"use strict";var n=r("6547").charAt;t.exports=function(t,e,r){return e+(r?n(t,e).length:1)}},9263:function(t,e,r){"use strict";var n=r("ad6d"),a=r("9f7f"),i=RegExp.prototype.exec,s=String.prototype.replace,o=i,c=function(){var t=/a/,e=/b*/g;return i.call(t,"a"),i.call(e,"a"),0!==t.lastIndex||0!==e.lastIndex}(),l=a.UNSUPPORTED_Y||a.BROKEN_CARET,u=void 0!==/()??/.exec("")[1],f=c||u||l;f&&(o=function(t){var e,r,a,o,f=this,d=l&&f.sticky,p=n.call(f),v=f.source,g=0,h=t;return d&&(p=p.replace("y",""),-1===p.indexOf("g")&&(p+="g"),h=String(t).slice(f.lastIndex),f.lastIndex>0&&(!f.multiline||f.multiline&&"\n"!==t[f.lastIndex-1])&&(v="(?: "+v+")",h=" "+h,g++),r=new RegExp("^(?:"+v+")",p)),u&&(r=new RegExp("^"+v+"$(?!\\s)",p)),c&&(e=f.lastIndex),a=i.call(d?r:f,h),d?a?(a.input=a.input.slice(g),a[0]=a[0].slice(g),a.index=f.lastIndex,f.lastIndex+=a[0].length):f.lastIndex=0:c&&a&&(f.lastIndex=f.global?a.index+a[0].length:e),u&&a&&a.length>1&&s.call(a[0],r,(function(){for(o=1;o<arguments.length-2;o++)void 0===arguments[o]&&(a[o]=void 0)})),a}),t.exports=o},"9f7f":function(t,e,r){"use strict";var n=r("d039");function a(t,e){return RegExp(t,e)}e.UNSUPPORTED_Y=n((function(){var t=a("a","y");return t.lastIndex=2,null!=t.exec("abcd")})),e.BROKEN_CARET=n((function(){var t=a("^r","gy");return t.lastIndex=2,null!=t.exec("str")}))},a4d3:function(t,e,r){"use strict";var n=r("23e7"),a=r("da84"),i=r("d066"),s=r("c430"),o=r("83ab"),c=r("4930"),l=r("fdbf"),u=r("d039"),f=r("5135"),d=r("e8b5"),p=r("861d"),v=r("825a"),g=r("7b0b"),h=r("fc6a"),m=r("c04e"),b=r("5c6c"),y=r("7c73"),x=r("df75"),S=r("241c"),C=r("057f"),L=r("7418"),P=r("06cf"),w=r("9bf2"),E=r("d1e7"),N=r("9112"),_=r("6eeb"),k=r("5692"),T=r("f772"),R=r("d012"),A=r("90e3"),O=r("b622"),U=r("e538"),j=r("746f"),I=r("d44e"),$=r("69f3"),M=r("b727").forEach,D=T("hidden"),H="Symbol",V="prototype",F=O("toPrimitive"),G=$.set,B=$.getterFor(H),Y=Object[V],q=a.Symbol,J=i("JSON","stringify"),K=P.f,X=w.f,Q=C.f,W=E.f,z=k("symbols"),Z=k("op-symbols"),tt=k("string-to-symbol-registry"),et=k("symbol-to-string-registry"),rt=k("wks"),nt=a.QObject,at=!nt||!nt[V]||!nt[V].findChild,it=o&&u((function(){return 7!=y(X({},"a",{get:function(){return X(this,"a",{value:7}).a}})).a}))?function(t,e,r){var n=K(Y,e);n&&delete Y[e],X(t,e,r),n&&t!==Y&&X(Y,e,n)}:X,st=function(t,e){var r=z[t]=y(q[V]);return G(r,{type:H,tag:t,description:e}),o||(r.description=e),r},ot=l?function(t){return"symbol"==typeof t}:function(t){return Object(t)instanceof q},ct=function(t,e,r){t===Y&&ct(Z,e,r),v(t);var n=m(e,!0);return v(r),f(z,n)?(r.enumerable?(f(t,D)&&t[D][n]&&(t[D][n]=!1),r=y(r,{enumerable:b(0,!1)})):(f(t,D)||X(t,D,b(1,{})),t[D][n]=!0),it(t,n,r)):X(t,n,r)},lt=function(t,e){v(t);var r=h(e),n=x(r).concat(vt(r));return M(n,(function(e){o&&!ft.call(r,e)||ct(t,e,r[e])})),t},ut=function(t,e){return void 0===e?y(t):lt(y(t),e)},ft=function(t){var e=m(t,!0),r=W.call(this,e);return!(this===Y&&f(z,e)&&!f(Z,e))&&(!(r||!f(this,e)||!f(z,e)||f(this,D)&&this[D][e])||r)},dt=function(t,e){var r=h(t),n=m(e,!0);if(r!==Y||!f(z,n)||f(Z,n)){var a=K(r,n);return!a||!f(z,n)||f(r,D)&&r[D][n]||(a.enumerable=!0),a}},pt=function(t){var e=Q(h(t)),r=[];return M(e,(function(t){f(z,t)||f(R,t)||r.push(t)})),r},vt=function(t){var e=t===Y,r=Q(e?Z:h(t)),n=[];return M(r,(function(t){!f(z,t)||e&&!f(Y,t)||n.push(z[t])})),n};if(c||(q=function(){if(this instanceof q)throw TypeError("Symbol is not a constructor");var t=arguments.length&&void 0!==arguments[0]?String(arguments[0]):void 0,e=A(t),r=function(t){this===Y&&r.call(Z,t),f(this,D)&&f(this[D],e)&&(this[D][e]=!1),it(this,e,b(1,t))};return o&&at&&it(Y,e,{configurable:!0,set:r}),st(e,t)},_(q[V],"toString",(function(){return B(this).tag})),_(q,"withoutSetter",(function(t){return st(A(t),t)})),E.f=ft,w.f=ct,P.f=dt,S.f=C.f=pt,L.f=vt,U.f=function(t){return st(O(t),t)},o&&(X(q[V],"description",{configurable:!0,get:function(){return B(this).description}}),s||_(Y,"propertyIsEnumerable",ft,{unsafe:!0}))),n({global:!0,wrap:!0,forced:!c,sham:!c},{Symbol:q}),M(x(rt),(function(t){j(t)})),n({target:H,stat:!0,forced:!c},{for:function(t){var e=String(t);if(f(tt,e))return tt[e];var r=q(e);return tt[e]=r,et[r]=e,r},keyFor:function(t){if(!ot(t))throw TypeError(t+" is not a symbol");if(f(et,t))return et[t]},useSetter:function(){at=!0},useSimple:function(){at=!1}}),n({target:"Object",stat:!0,forced:!c,sham:!o},{create:ut,defineProperty:ct,defineProperties:lt,getOwnPropertyDescriptor:dt}),n({target:"Object",stat:!0,forced:!c},{getOwnPropertyNames:pt,getOwnPropertySymbols:vt}),n({target:"Object",stat:!0,forced:u((function(){L.f(1)}))},{getOwnPropertySymbols:function(t){return L.f(g(t))}}),J){var gt=!c||u((function(){var t=q();return"[null]"!=J([t])||"{}"!=J({a:t})||"{}"!=J(Object(t))}));n({target:"JSON",stat:!0,forced:gt},{stringify:function(t,e,r){var n,a=[t],i=1;while(arguments.length>i)a.push(arguments[i++]);if(n=e,(p(e)||void 0!==t)&&!ot(t))return d(e)||(e=function(t,e){if("function"==typeof n&&(e=n.call(this,t,e)),!ot(e))return e}),a[1]=e,J.apply(null,a)}})}q[V][F]||N(q[V],F,q[V].valueOf),I(q,H),R[D]=!0},ac1f:function(t,e,r){"use strict";var n=r("23e7"),a=r("9263");n({target:"RegExp",proto:!0,forced:/./.exec!==a},{exec:a})},ad6d:function(t,e,r){"use strict";var n=r("825a");t.exports=function(){var t=n(this),e="";return t.global&&(e+="g"),t.ignoreCase&&(e+="i"),t.multiline&&(e+="m"),t.dotAll&&(e+="s"),t.unicode&&(e+="u"),t.sticky&&(e+="y"),e}},b727:function(t,e,r){var n=r("0366"),a=r("44ad"),i=r("7b0b"),s=r("50c4"),o=r("65f0"),c=[].push,l=function(t){var e=1==t,r=2==t,l=3==t,u=4==t,f=6==t,d=5==t||f;return function(p,v,g,h){for(var m,b,y=i(p),x=a(y),S=n(v,g,3),C=s(x.length),L=0,P=h||o,w=e?P(p,C):r?P(p,0):void 0;C>L;L++)if((d||L in x)&&(m=x[L],b=S(m,L,y),t))if(e)w[L]=b;else if(b)switch(t){case 3:return!0;case 5:return m;case 6:return L;case 2:c.call(w,m)}else if(u)return!1;return f?-1:l||u?u:w}};t.exports={forEach:l(0),map:l(1),filter:l(2),some:l(3),every:l(4),find:l(5),findIndex:l(6)}},d28b:function(t,e,r){var n=r("746f");n("iterator")},d784:function(t,e,r){"use strict";r("ac1f");var n=r("6eeb"),a=r("d039"),i=r("b622"),s=r("9263"),o=r("9112"),c=i("species"),l=!a((function(){var t=/./;return t.exec=function(){var t=[];return t.groups={a:"7"},t},"7"!=="".replace(t,"$<a>")})),u=function(){return"$0"==="a".replace(/./,"$0")}(),f=i("replace"),d=function(){return!!/./[f]&&""===/./[f]("a","$0")}(),p=!a((function(){var t=/(?:)/,e=t.exec;t.exec=function(){return e.apply(this,arguments)};var r="ab".split(t);return 2!==r.length||"a"!==r[0]||"b"!==r[1]}));t.exports=function(t,e,r,f){var v=i(t),g=!a((function(){var e={};return e[v]=function(){return 7},7!=""[t](e)})),h=g&&!a((function(){var e=!1,r=/a/;return"split"===t&&(r={},r.constructor={},r.constructor[c]=function(){return r},r.flags="",r[v]=/./[v]),r.exec=function(){return e=!0,null},r[v](""),!e}));if(!g||!h||"replace"===t&&(!l||!u||d)||"split"===t&&!p){var m=/./[v],b=r(v,""[t],(function(t,e,r,n,a){return e.exec===s?g&&!a?{done:!0,value:m.call(e,r,n)}:{done:!0,value:t.call(r,e,n)}:{done:!1}}),{REPLACE_KEEPS_$0:u,REGEXP_REPLACE_SUBSTITUTES_UNDEFINED_CAPTURE:d}),y=b[0],x=b[1];n(String.prototype,t,y),n(RegExp.prototype,v,2==e?function(t,e){return x.call(t,this,e)}:function(t){return x.call(t,this)})}f&&o(RegExp.prototype[v],"sham",!0)}},ddb0:function(t,e,r){var n=r("da84"),a=r("fdbc"),i=r("e260"),s=r("9112"),o=r("b622"),c=o("iterator"),l=o("toStringTag"),u=i.values;for(var f in a){var d=n[f],p=d&&d.prototype;if(p){if(p[c]!==u)try{s(p,c,u)}catch(g){p[c]=u}if(p[l]||s(p,l,f),a[f])for(var v in i)if(p[v]!==i[v])try{s(p,v,i[v])}catch(g){p[v]=i[v]}}}},e01a:function(t,e,r){"use strict";var n=r("23e7"),a=r("83ab"),i=r("da84"),s=r("5135"),o=r("861d"),c=r("9bf2").f,l=r("e893"),u=i.Symbol;if(a&&"function"==typeof u&&(!("description"in u.prototype)||void 0!==u().description)){var f={},d=function(){var t=arguments.length<1||void 0===arguments[0]?void 0:String(arguments[0]),e=this instanceof d?new u(t):void 0===t?u():u(t);return""===t&&(f[e]=!0),e};l(d,u);var p=d.prototype=u.prototype;p.constructor=d;var v=p.toString,g="Symbol(test)"==String(u("test")),h=/^Symbol\((.*)\)[^)]+$/;c(p,"description",{configurable:!0,get:function(){var t=o(this)?this.valueOf():this,e=v.call(t);if(s(f,t))return"";var r=g?e.slice(7,-1):e.replace(h,"$1");return""===r?void 0:r}}),n({global:!0,forced:!0},{Symbol:d})}},e1d9:function(t,e,r){},e420:function(t,e,r){"use strict";r.r(e);var n=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"container"},[r("section",{staticClass:"row justify-content-between"},[r("nav",{staticClass:"d-flex col-12 mt-3 justify-content-center col-xl mt-xl-0 order-1 order-xl-0 justify-content-xl-start "},[r("ul",{staticClass:"pagination",attrs:{id:"pagination"}},[r("li",{staticClass:"page-item"},[r("a",{staticClass:"page-link",attrs:{href:"javascript:void(null)"},on:{click:function(e){return t.pagePreClickHandle()}}},[t._v("上一页")])]),r("li",{staticClass:"page-item"},[r("a",{staticClass:"page-link",attrs:{href:"javascript:void(null)"},on:{click:function(e){return t.pageFirstClickHandle()}}},[t._v("<<")])]),t._l(t.pageNumList,(function(e){return r("li",{staticClass:"page-item",on:{click:function(r){return t.pageClickHandle(e,r)}}},[r("a",{staticClass:"page-link",attrs:{href:"javascript:void(null)"}},[t._v(t._s(e))])])})),r("li",{staticClass:"page-item"},[r("a",{staticClass:"page-link",attrs:{href:"javascript:void(null)"},on:{click:function(e){return t.pageLastClickHandle()}}},[t._v(">>")])]),r("li",{staticClass:"page-item"},[r("a",{staticClass:"page-link",attrs:{href:"javascript:void(null)"},on:{click:function(e){return t.pageNextClickHandle()}}},[t._v("下一页")])])],2)]),t._m(0)]),r("section",{staticClass:"mt-4",attrs:{id:"long-show-box-list"}},[r("ul",t._l(t.videoList,(function(e){return r("li",{staticClass:" row"},[r("a",{staticClass:"long-show-box d-flex pb-3 pt-3",attrs:{href:t.playUrlPre+e.vid}},[r("div",{staticClass:"col-5 col-md-4 col-xl-2"},[r("a",{staticClass:"d-flex g-img-link",attrs:{href:t.playUrlPre+e.vid}},[r("img",{staticClass:"img-fluid",attrs:{src:e.pic,alt:""}})])]),r("div",{staticClass:"middle d-flex flex-column justify-content-between mt-1 col col-xl-7"},[r("div",{staticClass:"row align-items-center"},[r("a",{staticClass:"title col",attrs:{href:t.playUrlPre+e.vid}},[t._v(" "+t._s(e.title)+" ")])]),r("a",{staticClass:"introduction text-muted",attrs:{href:t.playUrlPre+e.vid}},[t._v(" "+t._s(e.introduction)+" ")]),r("div",{staticClass:"bottom row no-gutters align-items-center"},[r("p",{staticClass:"view"},[r("span",{staticClass:"fa fa-play-circle-o"}),t._v(" "+t._s(e.viewCount)+" ")]),r("p",{staticClass:"comment"},[r("span",{staticClass:"fa fa-comment-o"}),t._v(" "+t._s(e.commentCount)+" ")]),r("p",{staticClass:"collect d-none d-xl-block"},[r("span",{staticClass:"fa fa-pencil-square-o"}),t._v(" "+t._s(e.collectCount)+" ")])])]),r("div",{staticClass:"d-none d-lg-flex mt-1 p-0  col-3"},[r("div",{staticClass:"right col d-flex align-items-center justify-content-end"},[r("a",{staticClass:"name pr-2 mr-2 border-secondary border-right",attrs:{href:t.personalSpaceUrlPre+e.uid}},[r("i",{staticClass:"fa fa-user-o"}),t._v(" "+t._s(e.author)+" ")]),r("p",{staticClass:"time text-muted"},[r("i",{staticClass:"fa fa-calendar-check-o"}),t._v(" "+t._s(t.formatTime(e.releaseDate,"Y / M / D"))+" ")])])])])])})),0)])])},a=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"d-flex col-12 order-0 justify-content-center col-xl order-xl-1  justify-content-xl-end"},[r("nav",{staticClass:"nav nav-pills"},[r("a",{staticClass:"nav-link active",attrs:{href:"#"}},[t._v("投稿时间排序")]),r("a",{staticClass:"nav-link",attrs:{href:"#"}},[t._v("视频热度排序")])]),r("div",{staticClass:"dropdown"},[r("button",{staticClass:"btn btn-secondary dropdown-toggle",attrs:{type:"button","data-toggle":"dropdown"}},[t._v(" 播放数 ")]),r("div",{staticClass:"dropdown-menu"},[r("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("评论数")]),r("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("点赞数")]),r("a",{staticClass:"dropdown-item",attrs:{href:"#"}},[t._v("收藏数")])])])])}],i=(r("a4d3"),r("e01a"),r("d28b"),r("d3b7"),r("3ca3"),r("ddb0"),r("debc")),s=r.n(i),o=r("2f14"),c=10,l={name:"sort",data:function(){return{sortName:this.$route.params.sortName,playUrlPre:o["b"].playUrlPre,personalSpaceUrlPre:o["b"].personalSpaceUrlPre,videoList:[],page:{start:0,last:0,lastPage:0},pageNumList:[1,2,3,4,5]}},created:function(){this.initVideoListAndPage(this.sortName)},watch:{$route:function(t,e){this.initVideoListAndPage(t.params.sortName)}},methods:{initVideoListAndPage:function(t){var e=this,r={sortName:t,videoNum:c,pageStart:0};axios({method:"post",url:"video/getSortVideoList",data:r,headers:{"Content-Type":"application/json; charset=utf-8"}}).then((function(t){var r=t.data;e.videoList=r.videoList,e.page.last=r.videoLastNum,0===e.page.last?alert("this.page.last === 0"):e.pageInit(c)})).catch((function(t){console.log(t)}))},pageInit:function(t){this.pageNumList=[];var e=Math.ceil(this.page.last/t);if(this.page.lastPage=e,e<5)for(var r=1;r<=e;r++)this.pageNumList.push(r);else this.pageNumList=[1,2,3,4,5];setTimeout((function(){var t=s()(".page-link:contains(1)");t.parent().addClass("active"),t.parent().attr("id","page-active")}),0)},formatTime:o["a"],pageClickHandle:function(t,e){this.pageNumList=[];var r=this.page.lastPage;if(r<5)for(var n=1;n<=r;n++)this.pageNumList.push(n);else{var a=r-2;t>3&&t<=a?this.pageNumList=[t-2,t-1,t,t+1,t+2]:t<=3?(this.pageNumList=[1,2,3,4,5],e.currentTarget.className+="active",e.currentTarget.id="page-active"):t>a&&(this.pageNumList=[r-4,r-3,r-2,r-1,r])}var i=e.currentTarget.parentNode.childNodes,o=!0,c=!1,l=void 0;try{for(var u,f=i[Symbol.iterator]();!(o=(u=f.next()).done);o=!0){var d=u.value;d.className="page-item",d.id=""}}catch(v){c=!0,l=v}finally{try{o||null==f.return||f.return()}finally{if(c)throw l}}setTimeout((function(){var e=s()(".page-link:contains("+t+")");e.parent().addClass("active"),e.parent().attr("id","page-active")}),0);var p=10*(t-1);this.getVideoList(this.sortName,p)},pagePreClickHandle:function(){s()("#page-active").prev().click()},pageNextClickHandle:function(){s()("#page-active").next().click()},pageFirstClickHandle:function(){this.pageNumList=[];var t=this.page.lastPage;if(t<5)for(var e=1;e<=t;e++)this.pageNumList.push(e);else this.pageNumList=[1,2,3,4,5];setTimeout((function(){s()("#pagination").children().eq(2).click()}),0)},pageLastClickHandle:function(){this.pageNumList=[];var t=this.page.lastPage;if(t<5)for(var e=1;e<=t;e++)this.pageNumList.push(e);else this.pageNumList=[t-4,t-3,t-2,t-1,t];setTimeout((function(){s()("#pagination").children().eq(-3).click()}),0)},getVideoList:function(t,e){var r=this,n={sortName:t,videoNum:c,pageStart:e};axios({method:"post",url:"video/getSortVideoList",data:n,headers:{"Content-Type":"application/json; charset=utf-8"}}).then((function(t){var e=t.data;r.videoList=e.videoList})).catch((function(t){console.log(t)}))}}},u=l,f=(r("5d9a"),r("2877")),d=Object(f["a"])(u,n,a,!1,null,"99410d42",null);e["default"]=d.exports},e538:function(t,e,r){var n=r("b622");e.f=n},e8b5:function(t,e,r){var n=r("c6b6");t.exports=Array.isArray||function(t){return"Array"==n(t)}},fdbc:function(t,e){t.exports={CSSRuleList:0,CSSStyleDeclaration:0,CSSValueList:0,ClientRectList:0,DOMRectList:0,DOMStringList:0,DOMTokenList:1,DataTransferItemList:0,FileList:0,HTMLAllCollection:0,HTMLCollection:0,HTMLFormElement:0,HTMLSelectElement:0,MediaList:0,MimeTypeArray:0,NamedNodeMap:0,NodeList:1,PaintRequestList:0,Plugin:0,PluginArray:0,SVGLengthList:0,SVGNumberList:0,SVGPathSegList:0,SVGPointList:0,SVGStringList:0,SVGTransformList:0,SourceBufferList:0,StyleSheetList:0,TextTrackCueList:0,TextTrackList:0,TouchList:0}}}]);
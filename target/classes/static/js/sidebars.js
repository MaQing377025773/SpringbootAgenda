/* global bootstrap: false */
(function () {
  'use strict'
  var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
  tooltipTriggerList.forEach(function (tooltipTriggerEl) {
    new bootstrap.Tooltip(tooltipTriggerEl)
  })
})()

$(function () {
  var picker1 = $('#datetime1').datetimepicker({
    format: 'YYYY-MM-DD',
    locale: moment.locale('zh-CN'),
    //minDate: '2016-7-1'
  });
  var picker2 = $('#datetime2').datetimepicker({
    format: 'YYYY-MM-DD',
    locale: moment.locale('zh-CN')
  });
  //动态设置最小值
  picker1.on('dp.change', function (e) {
    picker2.data('DateTime').minDate(e.date);
  });
  //动态设置最大值
  picker2.on('dp.change', function (e) {
    picker1.data('DateTime').maxDate(e.date);
  });
});
$('.input-daterange input').each(function () {
  $(this).datepicker({
    language: 'zh-CN', //语言
    autoclose: true, //选择后自动关闭
    clearBtn: true,//清除按钮
    format: "yyyy-mm-dd"//日期格式
  });
});
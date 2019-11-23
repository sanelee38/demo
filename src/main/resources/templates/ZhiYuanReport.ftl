<html>

<head>
    <meta http-equiv=Content-Type content="text/html; charset=gb2312">
    <meta name=Generator content="Microsoft Word 15 (filtered)">
    <style>
        <!--
        /* Font Definitions */
        @font-face
        {font-family:宋体;
            panose-1:2 1 6 0 3 1 1 1 1 1;}
        @font-face
        {font-family:"Cambria Math";
            panose-1:2 4 5 3 5 4 6 3 2 4;}
        @font-face
        {font-family:等线;
            panose-1:2 1 6 0 3 1 1 1 1 1;}
        @font-face
        {font-family:"\@宋体";
            panose-1:2 1 6 0 3 1 1 1 1 1;}
        @font-face
        {font-family:"\@等线";
            panose-1:2 1 6 0 3 1 1 1 1 1;}
        /* Style Definitions */
        p.MsoNormal, li.MsoNormal, div.MsoNormal
        {margin:0cm;
            margin-bottom:.0001pt;
            text-align:justify;
            text-justify:inter-ideograph;
            font-size:10.5pt;
            font-family:等线;}
        .MsoChpDefault
        {font-family:等线;}
        /* Page Definitions */
        @page WordSection1
        {size:595.3pt 841.9pt;
            margin:72.0pt 90.0pt 72.0pt 90.0pt;
            layout-grid:15.6pt;}
        div.WordSection1
        {page:WordSection1;}
        -->
    </style>

</head>

<body lang=ZH-CN style='text-justify-trim:punctuation'>

<div class=WordSection1 style='layout-grid:15.6pt'>

    <section>
        <table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0
               style='border-collapse:collapse;border:none'>
            <tr>
                <td width=369 colspan=2 valign=top style='width:276.5pt;border:solid windowtext 1.0pt;
  background:#FFC000;padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span
                                style='font-family:宋体'>个人信息</span></p>
                </td>
            </tr>
            <tr>
                <td width=184 valign=top style='width:138.25pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span
                                style='font-family:宋体'>姓名：</span></p>
                </td>
                <td width=184 valign=top style='width:138.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                    style='font-family:宋体'>${name}</span></p>
                </td>
            </tr>
            <tr>
                <td width=184 valign=top style='width:138.25pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span
                                style='font-family:宋体'>年龄：</span></p>
                </td>
                <td width=184 valign=top style='width:138.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                    style='font-family:宋体'>${age}</span></p>
                </td>
            </tr>
            <tr>
                <td width=184 valign=top style='width:138.25pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span
                                style='font-family:宋体'>分数：</span></p>
                </td>
                <td width=184 valign=top style='width:138.25pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                    style='font-family:宋体'>${score}</span></p>
                </td>
            </tr>
        </table>
    </section>

<section class="detail">
    <p class=MsoNormal><span lang=EN-US style='font-family:宋体'>&nbsp;</span></p>

    <table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0
           style='border-collapse:collapse;border:none'>
        <tr>
            <td width=415 colspan=3 valign=top style='width:311.1pt;border:solid windowtext 1.0pt;
  background:#00B050;padding:0cm 5.4pt 0cm 5.4pt'>
                <p class=MsoNormal align=center style='text-align:center'><span
                            style='font-family:宋体'>志愿<span style='color:black'>推荐</span></span></p>
            </td>
        </tr>
        <#list detailList as ad>

            <tr>
                <td width=138 rowspan=3 valign=top style='width:103.7pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span
                                style='font-family:宋体'>第一志愿</span></p>
                </td>
                <td width=138 valign=top style='width:103.7pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                    style='font-family:宋体'>${ad.colum1}</span></p>
                </td>
                <td width=138 valign=top style='width:103.7pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                    <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                    style='font-family:宋体'>${ad.colum2}</span></p>
                </td>
            </tr>
        </#list>

        <tr>
            <td width=138 valign=top style='width:103.7pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                style='font-family:宋体'>&nbsp;</span></p>
            </td>
            <td width=138 valign=top style='width:103.7pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                style='font-family:宋体'>&nbsp;</span></p>
            </td>
        </tr>
        <tr>
            <td width=138 valign=top style='width:103.7pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                style='font-family:宋体'>&nbsp;</span></p>
            </td>
            <td width=138 valign=top style='width:103.7pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
                <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
                                                                                style='font-family:宋体'>&nbsp;</span></p>
            </td>
        </tr>
    </table>

    <p class=MsoNormal><span lang=EN-US style='font-family:宋体'>&nbsp;</span></p>
</section>


</div>

</body>

</html>

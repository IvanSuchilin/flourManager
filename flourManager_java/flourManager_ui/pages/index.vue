<template>
<b-container style="background: olive; text-align: center; justify-content: center">
  <b-row>
    <b-col style="padding: 5%;">
    <ul class="tools">
      <li class="water"><b-badge variant="primary">0</b-badge></li>
      <li class="txt">+</li>
      <li class="fabric"><b-badge variant="warning">0</b-badge></li>
      <li class="txt">=</li>
      <li class="flour"><b-badge variant="primary">0</b-badge></li>
    </ul>
      <div>
        <h3>Water: 0</h3>
        <b-progress :value="3" :max ="10" animated variant="primary"></b-progress>
        <h3>Energy: 0</h3>
        <b-progress :value="4" :max ="10" animated variant="warning"></b-progress>
        <h3>Millet: 0</h3>
        <b-progress :value="4" :max ="10" animated variant="danger"></b-progress>
      </div>
      <div>
        <b-img src = "/water_mill.gif"></b-img>
      </div>
    </b-col>
  </b-row>
</b-container>
</template>

<script>
</script>

<style>
.tools{
  list-style: none;
  display: inline-flex;
}
.tools li{
  width: 80px; height: 80px; border-radius: 50%; border: #35495e 3px solid;
}
.tools li.txt{
  border: none; line-height: 80px; color: white; font-size: 300%;
}
.tools li.water{
  background: #fff url(/water.ico) no-repeat center center/cover;
}
.tools li.fabric{
  background: #fff url(/grain.ico) no-repeat center center/cover;
}
.tools li.flour{
  background: #fff url(/flour.ico) no-repeat center center/cover;
}
</style>

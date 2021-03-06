const drawCustomize = {}

drawCustomize.onClick = function(state, e) {
  var point = this.newFeature({
    type: 'Feature',
    properties: {
      count: state.count
    },
    geometry: {
      type: 'Point',
      coordinates: [e.lngLat.lng, e.lngLat.lat],
      iconImage: 'point'
    }
  })
  this.addFeature(point) // puts the point on the map
}
drawCustomize.onKeyUp = function(state, e) {
  if (e.keyCode === 27) return this.changeMode('simple_select')
}

drawCustomize.toDisplayFeatures = function(state, geojson, display) {
  display(geojson)
}
export default drawCustomize

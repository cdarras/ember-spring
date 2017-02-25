import DS from 'ember-data';

export default DS.RESTSerializer.extend({

  normalizeResponse(store, primaryModelClass, payload, id, requestType) {
    let restPayload = {};
    restPayload[primaryModelClass.modelName] = payload;
    return this._super(store, primaryModelClass, restPayload, id, requestType);
  }
});

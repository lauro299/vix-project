package com.example.vixproject.main.data

import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class NodeRepositoryImpTest{

    private val json ="""
        {
	"data": {
		"uiPage": {
			"urlPath": "/ondemand2",
			"pageName": "Inicio",
			"pageContentAvailability": {
				"isBlocked": false,
				"reason": null
			},
			"pageAnalyticsMetadata": {
				"keyValues": [{
					"key": "screen_id",
					"value": "/ondemand2"
				}, {
					"key": "screen_type",
					"value": "ui_page"
				}, {
					"key": "screen_title",
					"value": "/ondemand2"
				}]
			},
			"uiModules": {
				"totalCount": 56,
				"pageInfo": {
					"hasPreviousPage": false,
					"hasNextPage": true,
					"startCursor": "2ceff66ffad038cd8e00fdbe0d7d6cf7d70bbd3a",
					"endCursor": "e5956f04da6dcf676effaf4eca0b69a4a7765114"
				},
				"edges": [{
					"cursor": "2ceff66ffad038cd8e00fdbe0d7d6cf7d70bbd3a",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "2ceff66ffad038cd8e00fdbe0d7d6cf7d70bbd3a",
							"ui_module_title": "Miami Heroes",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "HERO_CAROUSEL"
						},
						"trackingId": "2ceff66ffad038cd8e00fdbe0d7d6cf7d70bbd3a",
						"title": "Miami Heroes",
						"moduleType": "HERO_CAROUSEL",
						"scrollingTimeSeconds": null,
						"contents": {
							"totalCount": 6,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": false,
								"startCursor": "series:mcp:4279",
								"endCursor": "series:mcp:3680"
							},
							"edges": [{
								"cursor": "series:mcp:4279",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4279",
										"ui_content_title": "Paraíso blanco",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"landscapeFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-landscape/64b70996afffd6551c6e8bca/e3fa572d7b16505bf2211919e26408d8",
										"link": "https://images.vix.com/prd/hero-landscape/64b70996afffd6551c6e8bca/e3fa572d7b16505bf2211919e26408d8",
										"imageRole": "HORIZONTAL_HERO"
									},
									"portraitFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-portrait/64b7195068aaf4124ccbcf97/ce57be14d1740e278a3d08aa7088ee75",
										"link": "https://images.vix.com/prd/hero-portrait/64b7195068aaf4124ccbcf97/ce57be14d1740e278a3d08aa7088ee75",
										"imageRole": "VERTICAL_HERO"
									},
									"mobileFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-mobile/64b7197bbeec6dc9b65e4da0/64907018cc5b1df1ef386b00f1bf3458",
										"link": "https://images.vix.com/prd/hero-mobile/64b7197bbeec6dc9b65e4da0/64907018cc5b1df1ef386b00f1bf3458",
										"imageRole": "VERTICAL_HERO"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/hero-logo/64ae1d16d6c57e75aa2c1ce0/3cd7807fa8f308b2a79816e448787449",
										"link": "https://images.vix.com/prd/hero-logo/64ae1d16d6c57e75aa2c1ce0/3cd7807fa8f308b2a79816e448787449",
										"imageRole": "HERO_POSTER"
									},
									"textTitle": null,
									"heroTargetContentType": "VIDEO",
									"heroTarget": {
										"id": "series:mcp:4279",
										"videoType": "SERIES",
										"dateReleased": "2023-07-20T04:00:00.000Z",
										"dateModified": "2023-07-18T23:26:40.699Z",
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"title": "Paraíso blanco",
										"description": "La bio serie de Carlos Lehder, después de pasar 30 años en la cárcel regresa a Alemania con su hija Julie, recordando todo lo que dejó atrás.",
										"genres": ["Drama"],
										"badges": ["NEW_EPISODES"],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/64907018cc5b1df1ef386b00f1bf3458",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/64907018cc5b1df1ef386b00f1bf3458",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/9d657716b9b641226a7aa0e91861c323",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/9d657716b9b641226a7aa0e91861c323",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/24c4e9defb9833f39a3eed6bde73f5dd",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/24c4e9defb9833f39a3eed6bde73f5dd",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/db26856831c073d1493aa62b106de720",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/db26856831c073d1493aa62b106de720",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									},
									"sponsorMetadata": null
								}
							}, {
								"cursor": "series:mcp:2195",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:2195",
										"ui_content_title": "¿Qué Culpa Tiene Fatmagül?",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"landscapeFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-landscape/63da167cdffc250e35c3d9e4/1759842fc9e5bcbbfd47a8d7585a5e15",
										"link": "https://images.vix.com/prd/hero-landscape/63da167cdffc250e35c3d9e4/1759842fc9e5bcbbfd47a8d7585a5e15",
										"imageRole": "HORIZONTAL_HERO"
									},
									"portraitFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-portrait/63da1698dffc250e35c3d9e5/c05336a77c0b022ea1757086e8aa1879",
										"link": "https://images.vix.com/prd/hero-portrait/63da1698dffc250e35c3d9e5/c05336a77c0b022ea1757086e8aa1879",
										"imageRole": "VERTICAL_HERO"
									},
									"mobileFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-mobile/63da16a8068d1c675717b81f/12a175424bdee6412914657ba3c08f6f",
										"link": "https://images.vix.com/prd/hero-mobile/63da16a8068d1c675717b81f/12a175424bdee6412914657ba3c08f6f",
										"imageRole": "VERTICAL_HERO"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/hero-logo/63da153b93cf1b94ad03d00e/be73da3b2bd6ead1dfe66e3b2ea11097",
										"link": "https://images.vix.com/prd/hero-logo/63da153b93cf1b94ad03d00e/be73da3b2bd6ead1dfe66e3b2ea11097",
										"imageRole": "HERO_POSTER"
									},
									"textTitle": null,
									"heroTargetContentType": "VIDEO",
									"heroTarget": {
										"id": "series:mcp:2195",
										"videoType": "SERIES",
										"dateReleased": "2023-07-01T04:00:00.000Z",
										"dateModified": "2023-06-16T22:47:43.677Z",
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "S", "V"]
										}],
										"title": "¿Qué Culpa Tiene Fatmagül?",
										"description": "Fatmagül es una joven huérfana que vive en un humilde pueblo y sueña con una mejor vida junto a su gran amor Mustafá, quien está construyendo la casa donde vivirán cuando se casen. Sin embargo el destino le depara una sorpresa que cambiará su vida.",
										"genres": ["Drama", "Romance"],
										"badges": [],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/6f09481ca8b03ca5117976a862e7028c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/6f09481ca8b03ca5117976a862e7028c",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/12a175424bdee6412914657ba3c08f6f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/12a175424bdee6412914657ba3c08f6f",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/4d714028bcd3b114aeacd5388aa7fd88",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/4d714028bcd3b114aeacd5388aa7fd88",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/414b6279af2d25666110b970aa580944",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/414b6279af2d25666110b970aa580944",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/f69e9afbee246a2ebdbabbba4632b45f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/f69e9afbee246a2ebdbabbba4632b45f",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									},
									"sponsorMetadata": null
								}
							}, {
								"cursor": "series:mcp:3788",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3788",
										"ui_content_title": "María Félix",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"landscapeFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-landscape/648b37dd9f31b7bdf4844fa8/3b36d7231e7454e54fbe529d35c5c2d3",
										"link": "https://images.vix.com/prd/hero-landscape/648b37dd9f31b7bdf4844fa8/3b36d7231e7454e54fbe529d35c5c2d3",
										"imageRole": "HORIZONTAL_HERO"
									},
									"portraitFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-portrait/63102c21fe05a4e40cb4dfaf/734332bac738361b897f86687a14396d",
										"link": "https://images.vix.com/prd/hero-portrait/63102c21fe05a4e40cb4dfaf/734332bac738361b897f86687a14396d",
										"imageRole": "VERTICAL_HERO"
									},
									"mobileFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-mobile/648b37f8a234c68128bb2368/5d99e4fdbcb861929e7fc4f6f7a254de",
										"link": "https://images.vix.com/prd/hero-mobile/648b37f8a234c68128bb2368/5d99e4fdbcb861929e7fc4f6f7a254de",
										"imageRole": "VERTICAL_HERO"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/hero-logo/642735325eb6c74fcd55adac/94b05d4877d4b9df9af7fc8678fad3e7",
										"link": "https://images.vix.com/prd/hero-logo/642735325eb6c74fcd55adac/94b05d4877d4b9df9af7fc8678fad3e7",
										"imageRole": "HERO_POSTER"
									},
									"textTitle": null,
									"heroTargetContentType": "VIDEO",
									"heroTarget": {
										"id": "series:mcp:3788",
										"videoType": "SERIES",
										"dateReleased": "2022-07-11T04:00:00.000Z",
										"dateModified": "2023-06-28T00:03:26.260Z",
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": []
										}],
										"title": "María Félix",
										"description": "Esta es la historia de una mujer adelantada a su época, que enfrentó un mundo de hombres y se ganó su lugar. De espectacular belleza, vestida de pantalones, con la  ceja levantada y la voz grave, se convirtió en la máxima diva del cine mexicano.",
										"genres": ["Drama"],
										"badges": [],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/c72a949b8a1c872a0ee11b3063d8a0f8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/c72a949b8a1c872a0ee11b3063d8a0f8",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/cf1772800b7e5e041dffac042eba9485",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/cf1772800b7e5e041dffac042eba9485",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/58fda1b58ecfd97a2ea8b67f6eacfde4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/58fda1b58ecfd97a2ea8b67f6eacfde4",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/114819ecaafdb07e25255dcbdd6651c8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/114819ecaafdb07e25255dcbdd6651c8",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									},
									"sponsorMetadata": null
								}
							}, {
								"cursor": "series:mcp:4282",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4282",
										"ui_content_title": "Ana de nadie",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"landscapeFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-landscape/644c37107e47b402b4a72762/b485087844b0d295e277120b386096e8",
										"link": "https://images.vix.com/prd/hero-landscape/644c37107e47b402b4a72762/b485087844b0d295e277120b386096e8",
										"imageRole": "HORIZONTAL_HERO"
									},
									"portraitFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-portrait/644c373ff36e4aa8ed06b92c/d57bb939c7ca9546b038821c9dd6a72a",
										"link": "https://images.vix.com/prd/hero-portrait/644c373ff36e4aa8ed06b92c/d57bb939c7ca9546b038821c9dd6a72a",
										"imageRole": "VERTICAL_HERO"
									},
									"mobileFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-mobile/6451a02f38b5a923b7bee51c/87f2df78ad7a682ef73dda9e8b0c25d2",
										"link": "https://images.vix.com/prd/hero-mobile/6451a02f38b5a923b7bee51c/87f2df78ad7a682ef73dda9e8b0c25d2",
										"imageRole": "VERTICAL_HERO"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/hero-logo/6452c5bb47189a558b428273/c18dd4b96f0fbf3db3efafeda9b03196",
										"link": "https://images.vix.com/prd/hero-logo/6452c5bb47189a558b428273/c18dd4b96f0fbf3db3efafeda9b03196",
										"imageRole": "HERO_POSTER"
									},
									"textTitle": null,
									"heroTargetContentType": "VIDEO",
									"heroTarget": {
										"id": "series:mcp:4282",
										"videoType": "SERIES",
										"dateReleased": "2023-07-26T04:00:00.000Z",
										"dateModified": "2023-07-19T22:28:50.718Z",
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L", "S", "V"]
										}],
										"title": "Ana de nadie",
										"description": "Nuevos episodios cada semana. Tras 25 años de matrimonio; Ana, una mujer de 50 años, se entera que su marido le es infiel. Ella busca salvar su matrimonio, pero esta inesperada y dolorosa realidad la cuestiona como mujer, esposa, madre, hermana e hija.",
										"genres": ["Drama"],
										"badges": ["NEW_EPISODES"],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/21ee84b96eb0e83b230407ab8c9b27af",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/21ee84b96eb0e83b230407ab8c9b27af",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/87f2df78ad7a682ef73dda9e8b0c25d2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/87f2df78ad7a682ef73dda9e8b0c25d2",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/4e6b31664e7071aae412e0ff0455df89",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/4e6b31664e7071aae412e0ff0455df89",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/d57bb939c7ca9546b038821c9dd6a72a",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/d57bb939c7ca9546b038821c9dd6a72a",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/b485087844b0d295e277120b386096e8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/b485087844b0d295e277120b386096e8",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									},
									"sponsorMetadata": null
								}
							}, {
								"cursor": "series:mcp:3581",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3581",
										"ui_content_title": "India - Una historia de amor",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo, promo_us"
									},
									"landscapeFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-landscape/638fe9c62650f731aef87d20/9522e957147599559d84b6f349d913a1",
										"link": "https://images.vix.com/prd/hero-landscape/638fe9c62650f731aef87d20/9522e957147599559d84b6f349d913a1",
										"imageRole": "HORIZONTAL_HERO"
									},
									"portraitFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-portrait/638fe9d0a6c2ec8bf2c715e5/5d40bf97631cc0de1487487dd8cbd81d",
										"link": "https://images.vix.com/prd/hero-portrait/638fe9d0a6c2ec8bf2c715e5/5d40bf97631cc0de1487487dd8cbd81d",
										"imageRole": "VERTICAL_HERO"
									},
									"mobileFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-mobile/63bb8d5cea66ec91038d44c7/5fcf62f466eb3577758186c5df9e6562",
										"link": "https://images.vix.com/prd/hero-mobile/63bb8d5cea66ec91038d44c7/5fcf62f466eb3577758186c5df9e6562",
										"imageRole": "VERTICAL_HERO"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/hero-logo/638fe9b1fb3ee7d9eac7f938/2f9bd8fa0d12916ae78666e0f90216a7",
										"link": "https://images.vix.com/prd/hero-logo/638fe9b1fb3ee7d9eac7f938/2f9bd8fa0d12916ae78666e0f90216a7",
										"imageRole": "HERO_POSTER"
									},
									"textTitle": null,
									"heroTargetContentType": "VIDEO",
									"heroTarget": {
										"id": "series:mcp:3581",
										"videoType": "SERIES",
										"dateReleased": "2022-03-31T04:00:00.000Z",
										"dateModified": "2023-05-03T16:37:37.022Z",
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": []
										}],
										"title": "India - Una historia de amor",
										"description": "Maya es una mujer inteligente que trabaja haciendo telemarketing para Rajastán. Su familia tiene una larga tradición como comerciantes y es muy tradicional. Por otro lado, Bahuan estudia y trabaja en Estados Unidos para intentar huir de su pasado.",
										"genres": ["Novelas"],
										"badges": [],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/58757c4538372d29791191b57c1230df",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/58757c4538372d29791191b57c1230df",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/5fcf62f466eb3577758186c5df9e6562",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/5fcf62f466eb3577758186c5df9e6562",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/4c104a6ab0cefd78e7162f0e91d84e1d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/4c104a6ab0cefd78e7162f0e91d84e1d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/4d7ddba02e4334840911270914cc2ef5",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/4d7ddba02e4334840911270914cc2ef5",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/9522e957147599559d84b6f349d913a1",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/9522e957147599559d84b6f349d913a1",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									},
									"sponsorMetadata": null
								}
							}, {
								"cursor": "series:mcp:3680",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3680",
										"ui_content_title": "Doña Barbara",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"landscapeFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-landscape/6400df116f8fa383539be5fb/bce937a0a07ebc84c8a7035fa411bdd9",
										"link": "https://images.vix.com/prd/hero-landscape/6400df116f8fa383539be5fb/bce937a0a07ebc84c8a7035fa411bdd9",
										"imageRole": "HORIZONTAL_HERO"
									},
									"portraitFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-portrait/6400df21de629f1dcc64f6ed/2a1a4d720341cb03e33249d831563a22",
										"link": "https://images.vix.com/prd/hero-portrait/6400df21de629f1dcc64f6ed/2a1a4d720341cb03e33249d831563a22",
										"imageRole": "VERTICAL_HERO"
									},
									"mobileFillImage": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/hero-mobile/6400df2f85534007642e9eca/cbd98b7b3dfcf6ad6cf008ea49fff98d",
										"link": "https://images.vix.com/prd/hero-mobile/6400df2f85534007642e9eca/cbd98b7b3dfcf6ad6cf008ea49fff98d",
										"imageRole": "VERTICAL_HERO"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/hero-logo/6400def185534007642e9ec9/8a77050f5e30381f7be57e400634e529",
										"link": "https://images.vix.com/prd/hero-logo/6400def185534007642e9ec9/8a77050f5e30381f7be57e400634e529",
										"imageRole": "HERO_POSTER"
									},
									"textTitle": null,
									"heroTargetContentType": "VIDEO",
									"heroTarget": {
										"id": "series:mcp:3680",
										"videoType": "SERIES",
										"dateReleased": "2022-09-01T04:00:00.000Z",
										"dateModified": "2023-05-03T17:38:17.624Z",
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "S", "V"]
										}],
										"title": "Doña Barbara",
										"description": "Una telenovela adaptación de la novela de 1929 Doña Bárbara del autor venezolano Rómulo Gallego.",
										"genres": ["Drama"],
										"badges": [],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4246605/a06dc326f55a70412ff63943337561c2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4246605/a06dc326f55a70412ff63943337561c2",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4246605/cbd98b7b3dfcf6ad6cf008ea49fff98d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4246605/cbd98b7b3dfcf6ad6cf008ea49fff98d",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4246605/3efb5c300c838cbcfd1519b9fc38555c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4246605/3efb5c300c838cbcfd1519b9fc38555c",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4246605/2a1a4d720341cb03e33249d831563a22",
											"link": "https://images.vix.com/prd/videos/video:mcp:4246605/2a1a4d720341cb03e33249d831563a22",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4246605/bce937a0a07ebc84c8a7035fa411bdd9",
											"link": "https://images.vix.com/prd/videos/video:mcp:4246605/bce937a0a07ebc84c8a7035fa411bdd9",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									},
									"sponsorMetadata": null
								}
							}]
						}
					}
				}, {
					"cursor": "fcbefb78730e9ad8354cbc79caa93dcfb0e7bf9b",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "fcbefb78730e9ad8354cbc79caa93dcfb0e7bf9b",
							"ui_module_title": "Seguir viendo",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "CONTINUE_WATCHING_CAROUSEL"
						},
						"id": "fcbefb78730e9ad8354cbc79caa93dcfb0e7bf9b",
						"trackingId": "fcbefb78730e9ad8354cbc79caa93dcfb0e7bf9b",
						"moduleType": "CONTINUE_WATCHING_CAROUSEL",
						"title": "Seguir viendo"
					}
				}, {
					"cursor": "88751ce876862c81cae3571981aa248f78234886",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "88751ce876862c81cae3571981aa248f78234886",
							"ui_module_title": "ViX Originales ahora sín suscripción",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "VIDEO_CAROUSEL"
						},
						"id": "88751ce876862c81cae3571981aa248f78234886",
						"trackingId": "88751ce876862c81cae3571981aa248f78234886",
						"moduleType": "VIDEO_CAROUSEL",
						"treatment": "PORTRAIT",
						"title": "ViX Originales ahora sín suscripción",
						"caption": null,
						"landscapeFillImage": null,
						"portraitFillImage": null,
						"contents": {
							"totalCount": 8,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "series:mcp:3856",
								"endCursor": "series:mcp:3940"
							},
							"edges": [{
								"cursor": "series:mcp:3856",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3856",
										"ui_content_title": "De viaje con los Derbez",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
										"link": "https://images.vix.com/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3856",
										"videoType": "SERIES",
										"dateModified": "2023-07-14T17:19:41.866Z",
										"dateReleased": "2023-04-07T04:00:00.000Z",
										"copyrightYear": 2019,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L"]
										}],
										"language": null,
										"title": "De viaje con los Derbez",
										"description": "¡Y están de regreso! La divertida y adorable familia Derbez viaja de nuevo, pero en esta temporada, viajarán a Jamaica.. Para un viaje espiritual, emocionante, divertido,lleno de peligo, mucho amor y drama.",
										"genres": ["Comedia", "Viajes"],
										"contributors": [{
											"name": "Pablo Calasso",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Eugenio Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Aislinn Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "José Eduardo Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Vadhir Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Alessandra Rosaldo",
											"roles": ["ACTOR"]
										}, {
											"name": "Aitana Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Kailani",
											"roles": ["ACTOR"]
										}, {
											"name": "Mauricio Ochmann",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/786d59fdae99c4948a547f91f85635d9",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/786d59fdae99c4948a547f91f85635d9",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/4047cda8223685fd82007645370aaac6",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/4047cda8223685fd82007645370aaac6",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/9e24330f54df1712258036fb3b8c36d4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/9e24330f54df1712258036fb3b8c36d4",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/640b82c951ea7f699fa4c036f028bcca",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/640b82c951ea7f699fa4c036f028bcca",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3777",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3777",
										"ui_content_title": "Mi Vecino el Cartel",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4272442/2f8cacde53e87f3a81600bff0517df51",
										"link": "https://images.vix.com/prd/videos/video:mcp:4272442/2f8cacde53e87f3a81600bff0517df51",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3777",
										"videoType": "SERIES",
										"dateModified": "2023-06-27T16:01:16.762Z",
										"dateReleased": "2022-07-21T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": ["D", "V"]
										}],
										"language": null,
										"title": "Mi Vecino el Cartel",
										"description": "Productora Ejecutiva Selena Gomez y Blackfin presentan una docuserie que examina lo que ocurre cuando un violento asesinato sacude a una ciudad afluente en Texas.",
										"genres": ["Documental", "Crimen"],
										"contributors": [{
											"name": "Esther Reyes",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Selena Gómez",
											"roles": ["PRODUCER"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4272442/2f8cacde53e87f3a81600bff0517df51",
											"link": "https://images.vix.com/prd/videos/video:mcp:4272442/2f8cacde53e87f3a81600bff0517df51",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4272442/8d0ad2e4969081e7f0be7f2748e0e319",
											"link": "https://images.vix.com/prd/videos/video:mcp:4272442/8d0ad2e4969081e7f0be7f2748e0e319",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4272442/a8b00f3f56df51e7fea74ec4bcc96081",
											"link": "https://images.vix.com/prd/videos/video:mcp:4272442/a8b00f3f56df51e7fea74ec4bcc96081",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4272442/c0b14dcf1dd16d6cf462b32911eb9765",
											"link": "https://images.vix.com/prd/videos/video:mcp:4272442/c0b14dcf1dd16d6cf462b32911eb9765",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4272442/adf3c0abb08a7d15e5af4bfe8ecd35a7",
											"link": "https://images.vix.com/prd/videos/video:mcp:4272442/adf3c0abb08a7d15e5af4bfe8ecd35a7",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3738",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3738",
										"ui_content_title": "La mujer del diablo",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4264654/325e84965e13737009b4501578425083",
										"link": "https://images.vix.com/prd/videos/video:mcp:4264654/325e84965e13737009b4501578425083",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3738",
										"videoType": "SERIES",
										"dateModified": "2023-06-27T11:54:34.430Z",
										"dateReleased": "2022-07-18T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "V", "L", "S"]
										}],
										"language": null,
										"title": "La mujer del diablo",
										"description": "Estamos ante la historia de una obsesión. Amor entre un psicópata y una mujer con síndrome de Estocolmo. Cristo Beltrán se volvió loco por Natalia desde que la vio, no era un capricho temporal.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Carlos Andres",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Cock Marin",
											"roles": ["DIRECTOR"]
										}, {
											"name": "José Ron",
											"roles": ["ACTOR"]
										}, {
											"name": "Carolina Miranda",
											"roles": ["ACTOR"]
										}, {
											"name": "José Pablo Minor",
											"roles": ["ACTOR"]
										}, {
											"name": "Adriana Louvier",
											"roles": ["ACTOR"]
										}, {
											"name": "Mónica Dionne",
											"roles": ["ACTOR"]
										}, {
											"name": "Alejandro Calva",
											"roles": ["ACTOR"]
										}, {
											"name": "Jonathan Islas",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4264654/325e84965e13737009b4501578425083",
											"link": "https://images.vix.com/prd/videos/video:mcp:4264654/325e84965e13737009b4501578425083",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4264654/0c4fc719a310a4be53916f4e2f122c62",
											"link": "https://images.vix.com/prd/videos/video:mcp:4264654/0c4fc719a310a4be53916f4e2f122c62",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4264654/1cf2a93b2fb27c6334f7596ba1c072ab",
											"link": "https://images.vix.com/prd/videos/video:mcp:4264654/1cf2a93b2fb27c6334f7596ba1c072ab",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4264654/fbd6b657bd6a3108c6cfbb43d6cac0ec",
											"link": "https://images.vix.com/prd/videos/video:mcp:4264654/fbd6b657bd6a3108c6cfbb43d6cac0ec",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4264654/892e019607b27e99f9f2190c01da8d83",
											"link": "https://images.vix.com/prd/videos/video:mcp:4264654/892e019607b27e99f9f2190c01da8d83",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3788",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3788",
										"ui_content_title": "María Félix",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
										"link": "https://images.vix.com/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3788",
										"videoType": "SERIES",
										"dateModified": "2023-06-28T00:03:26.260Z",
										"dateReleased": "2022-07-11T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "María Félix",
										"description": "Esta es la historia de una mujer adelantada a su época, que enfrentó un mundo de hombres y se ganó su lugar. De espectacular belleza, vestida de pantalones, con la  ceja levantada y la voz grave, se convirtió en la máxima diva del cine mexicano.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Mafer Suárez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Emiliano González",
											"roles": ["ACTOR"]
										}, {
											"name": "Sandra Echeverría",
											"roles": ["ACTOR"]
										}, {
											"name": "Guillermo García Cantú",
											"roles": ["ACTOR"]
										}, {
											"name": "Iker Madrid",
											"roles": ["ACTOR"]
										}, {
											"name": "Ximena Romo",
											"roles": ["ACTOR"]
										}, {
											"name": "Abril Vergara",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/c72a949b8a1c872a0ee11b3063d8a0f8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/c72a949b8a1c872a0ee11b3063d8a0f8",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/cf1772800b7e5e041dffac042eba9485",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/cf1772800b7e5e041dffac042eba9485",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/58fda1b58ecfd97a2ea8b67f6eacfde4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/58fda1b58ecfd97a2ea8b67f6eacfde4",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/114819ecaafdb07e25255dcbdd6651c8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/114819ecaafdb07e25255dcbdd6651c8",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "video:mcp:4242189",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4242189",
										"ui_content_title": "Cocino cuando te extraño",
										"ui_content_type": "MOVIE",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4242189/0e2c1651622d9a4f60ea8da7cdc2bd92",
										"link": "https://images.vix.com/prd/videos/video:mcp:4242189/0e2c1651622d9a4f60ea8da7cdc2bd92",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4242189",
										"videoType": "MOVIE",
										"dateModified": "2023-06-15T18:52:53.065Z",
										"dateReleased": "2022-07-18T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-PG",
											"ratingSubValues": ["D"]
										}],
										"language": "es",
										"title": "Cocino cuando te extraño",
										"description": "Tres familias separadas por la migración se mantienen unidas por la fuerza de sus raíces y sus tradiciones, dos elementos expresados a través de la comida y el acto de compartir la mesa. Los platillos que preparan dejan huella en sus familias.",
										"genres": ["Documental"],
										"contributors": [{
											"name": "Andres Ibañez Diaz Infante",
											"roles": ["DIRECTOR", "PRODUCER"]
										}, {
											"name": "Alejandro Diaz San Vicente",
											"roles": ["DIRECTOR", "ACTOR", "PRODUCER"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/0e2c1651622d9a4f60ea8da7cdc2bd92",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/0e2c1651622d9a4f60ea8da7cdc2bd92",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/5f034a2ce45777790654062aa2932c35",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/5f034a2ce45777790654062aa2932c35",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/73fcfa6c9d779df9ea766dc40f3c7aa6",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/73fcfa6c9d779df9ea766dc40f3c7aa6",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/d591f48170dcc605a54f8bf0320eb5d2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/d591f48170dcc605a54f8bf0320eb5d2",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/a5ff4e6fc2d52e3c39fda900d3e7e151",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/a5ff4e6fc2d52e3c39fda900d3e7e151",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/0d30b7df57476fe08eef4218468a7fed",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/0d30b7df57476fe08eef4218468a7fed",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4242189/30b1aefbd2f272978e8570d0dd31df9b",
											"link": "https://images.vix.com/prd/videos/video:mcp:4242189/30b1aefbd2f272978e8570d0dd31df9b",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4242189"
												},
												"streamMetadata": {
													"duration": 3043,
													"introStartPosition": 145,
													"introEndPosition": 167,
													"outroStartPosition": 2917,
													"introSkippable": true,
													"outroSkippable": true
												}
											}
										}
									}
								}
							}, {
								"cursor": "series:mcp:3940",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3940",
										"ui_content_title": "Los Exorcistas",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4314600/9885670e1bc7cb301b02962076dc7c8f",
										"link": "https://images.vix.com/prd/videos/video:mcp:4314600/9885670e1bc7cb301b02962076dc7c8f",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3940",
										"videoType": "SERIES",
										"dateModified": "2023-06-28T20:02:36.569Z",
										"dateReleased": "2022-10-20T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "Los Exorcistas",
										"description": "La guerra entre el bien y el mal, se materializa en esta entrega, donde seis encargados de defender el bien, pelean alma a alma contra el mal, liberando y expulsando al demonio de los cuerpos posesos.",
										"genres": ["Documental"],
										"contributors": [{
											"name": "Miguel Angel Sanchez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Vidblain Balvas",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Jorge Linares",
											"roles": ["DIRECTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4314600/9885670e1bc7cb301b02962076dc7c8f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4314600/9885670e1bc7cb301b02962076dc7c8f",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4314600/76e99d214581649489451576c5167803",
											"link": "https://images.vix.com/prd/videos/video:mcp:4314600/76e99d214581649489451576c5167803",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4314600/d63036daae16e1e04eaec0e8b7acf4da",
											"link": "https://images.vix.com/prd/videos/video:mcp:4314600/d63036daae16e1e04eaec0e8b7acf4da",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4314600/cab4742d13fa7d4667d8535dd55fe196",
											"link": "https://images.vix.com/prd/videos/video:mcp:4314600/cab4742d13fa7d4667d8535dd55fe196",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4314600/55293cbac9e93426011499f28299594e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4314600/55293cbac9e93426011499f28299594e",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}]
						}
					}
				}, {
					"cursor": "af4be6c5b08f667d454359ea9646d896110cdaad",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "af4be6c5b08f667d454359ea9646d896110cdaad",
							"ui_module_title": "Descubre lo mejor de Premium",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "VIDEO_CAROUSEL"
						},
						"id": "af4be6c5b08f667d454359ea9646d896110cdaad",
						"trackingId": "af4be6c5b08f667d454359ea9646d896110cdaad",
						"moduleType": "VIDEO_CAROUSEL",
						"treatment": "PORTRAIT",
						"title": "Descubre lo mejor de Premium",
						"caption": null,
						"landscapeFillImage": null,
						"portraitFillImage": null,
						"contents": {
							"totalCount": 87,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "series:mcp:4279",
								"endCursor": "series:mcp:4497"
							},
							"edges": [{
								"cursor": "series:mcp:4279",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4279",
										"ui_content_title": "Paraíso blanco",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
										"link": "https://images.vix.com/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4279",
										"videoType": "SERIES",
										"dateModified": "2023-07-18T23:26:40.699Z",
										"dateReleased": "2023-07-20T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "Paraíso blanco",
										"description": "La bio serie de Carlos Lehder, después de pasar 30 años en la cárcel regresa a Alemania con su hija Julie, recordando todo lo que dejó atrás.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Camilo Villamizar",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Juan Vázquez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Sebastián Osorio",
											"roles": ["ACTOR"]
										}, {
											"name": "Variel Sánchez",
											"roles": ["ACTOR"]
										}, {
											"name": "César Álvarez",
											"roles": ["ACTOR"]
										}, {
											"name": "Michal Malinowski",
											"roles": ["ACTOR"]
										}, {
											"name": "Bibiana Navas",
											"roles": ["ACTOR"]
										}, {
											"name": "Isabella Miranda",
											"roles": ["ACTOR"]
										}, {
											"name": "Valeria Galviz",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/64907018cc5b1df1ef386b00f1bf3458",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/64907018cc5b1df1ef386b00f1bf3458",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/9d657716b9b641226a7aa0e91861c323",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/9d657716b9b641226a7aa0e91861c323",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/24c4e9defb9833f39a3eed6bde73f5dd",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/24c4e9defb9833f39a3eed6bde73f5dd",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/db26856831c073d1493aa62b106de720",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/db26856831c073d1493aa62b106de720",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": ["NEW_EPISODES"],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "video:mcp:4423596",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4423596",
										"ui_content_title": "Tráiler: Oaxaca: Una promesa hecha pueblo",
										"ui_content_type": "EXTRA",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4423596/2bd273d2692e871c7816cc18abdfc98e",
										"link": "https://images.vix.com/prd/videos/video:mcp:4423596/2bd273d2692e871c7816cc18abdfc98e",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4423596",
										"videoType": "EXTRA",
										"dateModified": "2023-07-19T20:46:42.899Z",
										"dateReleased": "2023-07-22T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-PG",
											"ratingSubValues": []
										}],
										"language": "es",
										"title": "Tráiler: Oaxaca: Una promesa hecha pueblo",
										"description": "Oaxaca es una fiesta que se vive en solidaridad. Al compartir, aquí, se le llama Guelaguetza, y está presente siempre como su forma de vivir.",
										"genres": ["Documental"],
										"contributors": [{
											"name": "María Eugenia Morón",
											"roles": ["DIRECTOR"]
										}, {
											"name": "N+Docs",
											"roles": ["PRODUCER"]
										}, {
											"name": "Lila Downs",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/2bd273d2692e871c7816cc18abdfc98e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/2bd273d2692e871c7816cc18abdfc98e",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/4a43432b8ad3487a9a608b761f1d55f7",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/4a43432b8ad3487a9a608b761f1d55f7",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/b2159861d94b3c385cea42d75f5fbdda",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/b2159861d94b3c385cea42d75f5fbdda",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/c5df7face0b6c3dbd9c3748767f81927",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/c5df7face0b6c3dbd9c3748767f81927",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/e79c55baed5a9d7eebf42eaf828b44fa",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/e79c55baed5a9d7eebf42eaf828b44fa",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/342f3e89b7374e3424fa436832a58f9a",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/342f3e89b7374e3424fa436832a58f9a",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4423596/18a810e846347322c46a074726061bb2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4423596/18a810e846347322c46a074726061bb2",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"extraType": "TRAILER",
											"playbackData": {
												"stream": {
													"mcpId": "4423596"
												},
												"streamMetadata": {
													"duration": 65
												}
											},
											"parents": [{
												"title": "Oaxaca: Una promesa hecha pueblo",
												"id": "video:mcp:4423533"
											}]
										}
									}
								}
							}, {
								"cursor": "video:mcp:4424483",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4424482",
										"ui_content_title": "Tráiler: La leyenda de los chaneques",
										"ui_content_type": "EXTRA",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4424482/41c26c087d34194ebd41f49e947cd806",
										"link": "https://images.vix.com/prd/videos/video:mcp:4424482/41c26c087d34194ebd41f49e947cd806",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4424482",
										"videoType": "EXTRA",
										"dateModified": "2023-07-14T16:30:11.146Z",
										"dateReleased": "2023-07-14T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-Y7",
											"ratingSubValues": ["FV"]
										}],
										"language": "es",
										"title": "Tráiler: La leyenda de los chaneques",
										"description": "Cinco años después de haber renunciado a sus poderes, Leo San Juan se encuentra en Veracruz acompañado de Nando cuando una antigua maldición local regresa. Esta vez, Leo no tiene poderes, no tiene amigos, tiempo y, al parecer… tampoco oportunidad.",
										"genres": ["Animación", "Comedia", "Familiar"],
										"contributors": [{
											"name": "Marvick Núñez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Fernando De Fuentes S.",
											"roles": ["PRODUCER"]
										}, {
											"name": "José C. García De Letona",
											"roles": ["PRODUCER"]
										}, {
											"name": "Benny Emmanuel",
											"roles": ["ACTOR"]
										}, {
											"name": "Emilio Treviño",
											"roles": ["ACTOR"]
										}, {
											"name": "Lalo España",
											"roles": ["ACTOR"]
										}, {
											"name": "Gabriel Basurto",
											"roles": ["ACTOR"]
										}, {
											"name": "Alejandro Villeli",
											"roles": ["ACTOR"]
										}, {
											"name": "Mayté Cordeiro",
											"roles": ["ACTOR"]
										}, {
											"name": "Paola Ramones",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/41c26c087d34194ebd41f49e947cd806",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/41c26c087d34194ebd41f49e947cd806",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/c9fc4cd6e8a8c777dccb7be03098f06e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/c9fc4cd6e8a8c777dccb7be03098f06e",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/067793f5d02dbdead857d4fc86ac5424",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/067793f5d02dbdead857d4fc86ac5424",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/9ccd18ada41cf883af1e0214adf8b75c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/9ccd18ada41cf883af1e0214adf8b75c",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/07bca314d3adfd9df3dc1b1ad6c3fdbd",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/07bca314d3adfd9df3dc1b1ad6c3fdbd",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/cb9965e6843533a1a7aa7a26d74900c4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/cb9965e6843533a1a7aa7a26d74900c4",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4424482/9ccd18ada41cf883af1e0214adf8b75c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4424482/9ccd18ada41cf883af1e0214adf8b75c",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"extraType": "TRAILER",
											"playbackData": {
												"stream": {
													"mcpId": "4424482"
												},
												"streamMetadata": {
													"duration": 121
												}
											},
											"parents": [{
												"title": "La leyenda de los chaneques",
												"id": "video:mcp:4424452"
											}]
										}
									}
								}
							}, {
								"cursor": "video:mcp:4417650",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4417650",
										"ui_content_title": "Tráiler: Dime lo que quieres (de verdad)",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4417650/81d1ccb5f1ca32764a4d4ea004fe9b5b",
										"link": "https://images.vix.com/prd/videos/video:mcp:4417650/81d1ccb5f1ca32764a4d4ea004fe9b5b",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4417650",
										"videoType": "MOVIE",
										"dateModified": "2023-07-11T17:32:20.485Z",
										"dateReleased": "2023-07-11T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": "es",
										"title": "Tráiler: Dime lo que quieres (de verdad)",
										"description": "Estreno 27 de julio. Dos parejas de amigos deciden adentrarse en el mundo swinger para experimentar el vértigo que significa el intercambio de parejas, con el objetivo de mantener la pasión, el deseo y la complicidad en sus duraderas relaciones.",
										"genres": ["Comedia", "Romance"],
										"contributors": [{
											"name": "Bruno Ascenso",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Stephanie Cayo",
											"roles": ["PRODUCER", "ACTOR"]
										}, {
											"name": "Manolo Cardona",
											"roles": ["PRODUCER", "ACTOR"]
										}, {
											"name": "Juancho Cardona",
											"roles": ["PRODUCER"]
										}, {
											"name": "Tony Daltón",
											"roles": ["ACTOR"]
										}, {
											"name": "Diego Torres",
											"roles": ["ACTOR"]
										}, {
											"name": "Angie Cepeda",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/81d1ccb5f1ca32764a4d4ea004fe9b5b",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/81d1ccb5f1ca32764a4d4ea004fe9b5b",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/0690e6f3c66da6460931baf3d0281aab",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/0690e6f3c66da6460931baf3d0281aab",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/b1f95141959cbdfb14be9202e43b71e4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/b1f95141959cbdfb14be9202e43b71e4",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/e56ea8502087def9cf5fbabe3d13ba5f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/e56ea8502087def9cf5fbabe3d13ba5f",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/810e3e85d8b5fdc40e994160ae09e3bc",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/810e3e85d8b5fdc40e994160ae09e3bc",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/6e3564e3917666a1ebaf5e93e70b2209",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/6e3564e3917666a1ebaf5e93e70b2209",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4417650/7a3bc3bebbee6c2ecf136f24d9433f3b",
											"link": "https://images.vix.com/prd/videos/video:mcp:4417650/7a3bc3bebbee6c2ecf136f24d9433f3b",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4417650"
												},
												"streamMetadata": {
													"duration": 111,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}, {
								"cursor": "series:mcp:4282",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4282",
										"ui_content_title": "Ana de nadie",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4422892/21ee84b96eb0e83b230407ab8c9b27af",
										"link": "https://images.vix.com/prd/videos/video:mcp:4422892/21ee84b96eb0e83b230407ab8c9b27af",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4282",
										"videoType": "SERIES",
										"dateModified": "2023-07-19T22:28:50.718Z",
										"dateReleased": "2023-07-26T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L", "S", "V"]
										}],
										"language": null,
										"title": "Ana de nadie",
										"description": "Nuevos episodios cada semana. Tras 25 años de matrimonio; Ana, una mujer de 50 años, se entera que su marido le es infiel. Ella busca salvar su matrimonio, pero esta inesperada y dolorosa realidad la cuestiona como mujer, esposa, madre, hermana e hija.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Olga Lucía Rodríguez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Luis Carlos Sierra",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Paola Turbay",
											"roles": ["ACTOR"]
										}, {
											"name": "Sebastián Carvajal",
											"roles": ["ACTOR"]
										}, {
											"name": "Jorge Enrique Abello",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/21ee84b96eb0e83b230407ab8c9b27af",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/21ee84b96eb0e83b230407ab8c9b27af",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/87f2df78ad7a682ef73dda9e8b0c25d2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/87f2df78ad7a682ef73dda9e8b0c25d2",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/4e6b31664e7071aae412e0ff0455df89",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/4e6b31664e7071aae412e0ff0455df89",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/d57bb939c7ca9546b038821c9dd6a72a",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/d57bb939c7ca9546b038821c9dd6a72a",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4422892/b485087844b0d295e277120b386096e8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4422892/b485087844b0d295e277120b386096e8",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": ["NEW_EPISODES"],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:4497",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4497",
										"ui_content_title": "Los Artistas: Primeros Trazos",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4408905/dc29265e638b7b809145568fb8c94652",
										"link": "https://images.vix.com/prd/videos/video:mcp:4408905/dc29265e638b7b809145568fb8c94652",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4497",
										"videoType": "SERIES",
										"dateModified": "2023-07-17T15:07:35.469Z",
										"dateReleased": "2023-07-07T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "V"]
										}],
										"language": null,
										"title": "Los Artistas: Primeros Trazos",
										"description": "Cata, una experta en arte originaria de México, se encuentra en un bache personal y profesional. Por casualidad conoce a Yago, quien les vende baratijas a coleccionistas inexpertos.",
										"genres": ["Comedia", "Romance", "Aventura"],
										"contributors": [{
											"name": "Joaquín Lllamas",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Francesc Garrido",
											"roles": ["ACTOR"]
										}, {
											"name": "Ximena Romo",
											"roles": ["ACTOR"]
										}, {
											"name": "María Crespo",
											"roles": ["ACTOR"]
										}, {
											"name": "Maxi Iglesias",
											"roles": ["ACTOR"]
										}, {
											"name": "Manolo Caro",
											"roles": ["ACTOR"]
										}, {
											"name": "Lucía Bravo",
											"roles": ["ACTOR"]
										}, {
											"name": "Miguel Herrera",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408905/dc29265e638b7b809145568fb8c94652",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408905/dc29265e638b7b809145568fb8c94652",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408905/5a0227805aad3e2f2efdd45f804cb137",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408905/5a0227805aad3e2f2efdd45f804cb137",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408905/3b1728f8efb3c072de5a4cbb904d37d0",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408905/3b1728f8efb3c072de5a4cbb904d37d0",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408905/214b9b6ca5a4eec25d4600affe840e5f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408905/214b9b6ca5a4eec25d4600affe840e5f",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408905/72b7c60c2708f6c05b14de3a97bb11ba",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408905/72b7c60c2708f6c05b14de3a97bb11ba",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}]
						}
					}
				}, {
					"cursor": "9a112fe3774f30e5726850372ee39e07a31cc29c",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "9a112fe3774f30e5726850372ee39e07a31cc29c",
							"ui_module_title": "Novelas más vistas",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "VIDEO_CAROUSEL"
						},
						"id": "9a112fe3774f30e5726850372ee39e07a31cc29c",
						"trackingId": "9a112fe3774f30e5726850372ee39e07a31cc29c",
						"moduleType": "VIDEO_CAROUSEL",
						"treatment": "PORTRAIT",
						"title": "Novelas más vistas",
						"caption": null,
						"landscapeFillImage": null,
						"portraitFillImage": null,
						"contents": {
							"totalCount": 112,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "series:mcp:2195",
								"endCursor": "series:mcp:783"
							},
							"edges": [{
								"cursor": "series:mcp:2195",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:2195",
										"ui_content_title": "¿Qué Culpa Tiene Fatmagül?",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4346741/6f09481ca8b03ca5117976a862e7028c",
										"link": "https://images.vix.com/prd/videos/video:mcp:4346741/6f09481ca8b03ca5117976a862e7028c",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:2195",
										"videoType": "SERIES",
										"dateModified": "2023-06-16T22:47:43.677Z",
										"dateReleased": "2023-07-01T04:00:00.000Z",
										"copyrightYear": 2010,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "S", "V"]
										}],
										"language": null,
										"title": "¿Qué Culpa Tiene Fatmagül?",
										"description": "Fatmagül es una joven huérfana que vive en un humilde pueblo y sueña con una mejor vida junto a su gran amor Mustafá, quien está construyendo la casa donde vivirán cuando se casen. Sin embargo el destino le depara una sorpresa que cambiará su vida.",
										"genres": ["Drama", "Romance"],
										"contributors": [{
											"name": "Hilal Saral",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Engin Akyürek",
											"roles": ["ACTOR"]
										}, {
											"name": "Kaan Erdogan",
											"roles": ["ACTOR"]
										}, {
											"name": "Kaan Tasaner",
											"roles": ["ACTOR"]
										}, {
											"name": "Beren Saat",
											"roles": ["ACTOR"]
										}, {
											"name": "Firat Çeli",
											"roles": ["ACTOR"]
										}, {
											"name": "Engin Selim Öztürk",
											"roles": ["ACTOR"]
										}, {
											"name": "Bugra Gülsoy",
											"roles": ["ACTOR"]
										}, {
											"name": "Ay Yapim",
											"roles": ["PRODUCER"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/6f09481ca8b03ca5117976a862e7028c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/6f09481ca8b03ca5117976a862e7028c",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/12a175424bdee6412914657ba3c08f6f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/12a175424bdee6412914657ba3c08f6f",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/4d714028bcd3b114aeacd5388aa7fd88",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/4d714028bcd3b114aeacd5388aa7fd88",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/414b6279af2d25666110b970aa580944",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/414b6279af2d25666110b970aa580944",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4346741/f69e9afbee246a2ebdbabbba4632b45f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4346741/f69e9afbee246a2ebdbabbba4632b45f",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:654",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:654",
										"ui_content_title": "Lo Que La Vida Me Robó",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:2884671/397a96342a86fc0cf21ecb4c36b195a5",
										"link": "https://images.vix.com/prd/videos/video:mcp:2884671/397a96342a86fc0cf21ecb4c36b195a5",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:654",
										"videoType": "SERIES",
										"dateModified": "2023-05-02T21:58:42.361Z",
										"dateReleased": "2022-02-28T14:00:00.000Z",
										"copyrightYear": 2013,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D"]
										}],
										"language": null,
										"title": "Lo Que La Vida Me Robó",
										"description": "La bella joven Montserrat se ve obligada a casarse con un hombre al que no ama para salvar de  la ruina y mantener la posición social de su familia",
										"genres": ["Novelas"],
										"contributors": [{
											"name": "Sebastián Rulli",
											"roles": ["ACTOR"]
										}, {
											"name": "Luis Roberto Guzmán",
											"roles": ["ACTOR"]
										}, {
											"name": "Angelique Boyer",
											"roles": ["ACTOR"]
										}, {
											"name": "Daniela Castro",
											"roles": ["ACTOR"]
										}, {
											"name": "Grettell Valdez",
											"roles": ["ACTOR"]
										}, {
											"name": "Sergio Sendel",
											"roles": ["ACTOR"]
										}, {
											"name": "Sergio Cataño",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Ignacio Alarcón",
											"roles": ["PRODUCER"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2884671/397a96342a86fc0cf21ecb4c36b195a5",
											"link": "https://images.vix.com/prd/videos/video:mcp:2884671/397a96342a86fc0cf21ecb4c36b195a5",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2884671/f3a03a7fee99fd9c45aecb5a48264277",
											"link": "https://images.vix.com/prd/videos/video:mcp:2884671/f3a03a7fee99fd9c45aecb5a48264277",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2884671/b4e23eefaf96ebddf05ae33cb3fc8e7d",
											"link": "https://images.vix.com/prd/videos/video:mcp:2884671/b4e23eefaf96ebddf05ae33cb3fc8e7d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2884671/20fe6b953e70ecd971963a804e0b9f78",
											"link": "https://images.vix.com/prd/videos/video:mcp:2884671/20fe6b953e70ecd971963a804e0b9f78",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2884671/287d7da3eaa06aa9fd70d4d3f7c2134e",
											"link": "https://images.vix.com/prd/videos/video:mcp:2884671/287d7da3eaa06aa9fd70d4d3f7c2134e",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:416",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:416",
										"ui_content_title": "Teresa",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:3036515/24008755e5895c0d871384b3c904ee93",
										"link": "https://images.vix.com/prd/videos/video:mcp:3036515/24008755e5895c0d871384b3c904ee93",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:416",
										"videoType": "SERIES",
										"dateModified": "2023-05-02T20:32:02.107Z",
										"dateReleased": "2022-06-23T23:00:00.000Z",
										"copyrightYear": 2010,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "S", "V"]
										}],
										"language": null,
										"title": "Teresa",
										"description": "Teresa es una bella mujer que, cegada por su ambición, hará lo que sea para abandonar el barrio pobre donde vive, el destino la lleva a decidir entre el amor de Mariano y Arturo, dos hombres que están dispuestos a dar su vida por ella.",
										"genres": ["Novelas"],
										"contributors": [{
											"name": "Angelique Boyer",
											"roles": ["ACTOR"]
										}, {
											"name": "Sebastián Rulliv",
											"roles": ["ACTOR"]
										}, {
											"name": "Aarón Díaz",
											"roles": ["ACTOR"]
										}, {
											"name": "Cynthia Klitbo",
											"roles": ["ACTOR"]
										}, {
											"name": "Fausto Sáinz",
											"roles": ["PRODUCER"]
										}, {
											"name": "Ana Brenda Contreras",
											"roles": ["ACTOR"]
										}, {
											"name": "Daniel Arenas",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3036515/24008755e5895c0d871384b3c904ee93",
											"link": "https://images.vix.com/prd/videos/video:mcp:3036515/24008755e5895c0d871384b3c904ee93",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3036515/76b85fc99fc14d509c79084185d206cf",
											"link": "https://images.vix.com/prd/videos/video:mcp:3036515/76b85fc99fc14d509c79084185d206cf",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3036515/f1ae322d50b652c6c67c2ce8db49674d",
											"link": "https://images.vix.com/prd/videos/video:mcp:3036515/f1ae322d50b652c6c67c2ce8db49674d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3036515/4dec3adf71b7999336b69cd0cb76aedc",
											"link": "https://images.vix.com/prd/videos/video:mcp:3036515/4dec3adf71b7999336b69cd0cb76aedc",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3036515/76a1c99524b615f659c0523ad4e42ab8",
											"link": "https://images.vix.com/prd/videos/video:mcp:3036515/76a1c99524b615f659c0523ad4e42ab8",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:554",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:554",
										"ui_content_title": "Rebelde",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:2701017/193a822530bbc1afae337a81726bdcd0",
										"link": "https://images.vix.com/prd/videos/video:mcp:2701017/193a822530bbc1afae337a81726bdcd0",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:554",
										"videoType": "SERIES",
										"dateModified": "2023-05-02T21:52:49.322Z",
										"dateReleased": "2021-05-06T04:00:00.000Z",
										"copyrightYear": 2004,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L"]
										}],
										"language": null,
										"title": "Rebelde",
										"description": "El Elite Way School es un exclusivo colegio, cuenta con un programa de becas para jóvenes de escasos recursos; Mía, Miguel, Diego, Roberta, Lupita y Giovanni descubrirán que a pesar de todas sus diferencias, el gran amor por la música los unirá.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Anahí",
											"roles": ["ACTOR"]
										}, {
											"name": "Dulce María",
											"roles": ["ACTOR"]
										}, {
											"name": "Mayte Perroni",
											"roles": ["ACTOR"]
										}, {
											"name": "Alfonso Herrera",
											"roles": ["ACTOR"]
										}, {
											"name": "Christian Chávez",
											"roles": ["ACTOR"]
										}, {
											"name": "Christopher Uckermann",
											"roles": ["ACTOR"]
										}, {
											"name": "Pedro Damian",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Pedro Damián",
											"roles": ["PRODUCER"]
										}, {
											"name": "Alexis Covacevich",
											"roles": ["DIRECTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2701017/193a822530bbc1afae337a81726bdcd0",
											"link": "https://images.vix.com/prd/videos/video:mcp:2701017/193a822530bbc1afae337a81726bdcd0",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2701017/61daa0d67a0ba4d713eece6d1142157f",
											"link": "https://images.vix.com/prd/videos/video:mcp:2701017/61daa0d67a0ba4d713eece6d1142157f",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2701017/db41658be8db5d3cf765639960083595",
											"link": "https://images.vix.com/prd/videos/video:mcp:2701017/db41658be8db5d3cf765639960083595",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2701017/143398dc43e0761e900ef7a82448dd13",
											"link": "https://images.vix.com/prd/videos/video:mcp:2701017/143398dc43e0761e900ef7a82448dd13",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:2701017/2afd7cec296e54b0a82e07fcfe0c60ea",
											"link": "https://images.vix.com/prd/videos/video:mcp:2701017/2afd7cec296e54b0a82e07fcfe0c60ea",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3581",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3581",
										"ui_content_title": "India - Una historia de amor",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo, promo_us"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4223858/58757c4538372d29791191b57c1230df",
										"link": "https://images.vix.com/prd/videos/video:mcp:4223858/58757c4538372d29791191b57c1230df",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3581",
										"videoType": "SERIES",
										"dateModified": "2023-05-03T16:37:37.022Z",
										"dateReleased": "2022-03-31T04:00:00.000Z",
										"copyrightYear": 2009,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "India - Una historia de amor",
										"description": "Maya es una mujer inteligente que trabaja haciendo telemarketing para Rajastán. Su familia tiene una larga tradición como comerciantes y es muy tradicional. Por otro lado, Bahuan estudia y trabaja en Estados Unidos para intentar huir de su pasado.",
										"genres": ["Novelas"],
										"contributors": [{
											"name": "Marcos Schechtman",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Frederico Mayrink",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Juliana Paes",
											"roles": ["ACTOR"]
										}, {
											"name": "Rodrigo Lombardi",
											"roles": ["ACTOR"]
										}, {
											"name": "Tony Ramos",
											"roles": ["ACTOR"]
										}, {
											"name": "Márcio García",
											"roles": ["ACTOR"]
										}, {
											"name": "Lima Duarte",
											"roles": ["ACTOR"]
										}, {
											"name": "Marcos Schechtman",
											"roles": ["PRODUCER"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/58757c4538372d29791191b57c1230df",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/58757c4538372d29791191b57c1230df",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/5fcf62f466eb3577758186c5df9e6562",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/5fcf62f466eb3577758186c5df9e6562",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/4c104a6ab0cefd78e7162f0e91d84e1d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/4c104a6ab0cefd78e7162f0e91d84e1d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/4d7ddba02e4334840911270914cc2ef5",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/4d7ddba02e4334840911270914cc2ef5",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4223858/9522e957147599559d84b6f349d913a1",
											"link": "https://images.vix.com/prd/videos/video:mcp:4223858/9522e957147599559d84b6f349d913a1",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:783",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:783",
										"ui_content_title": "Mi Corazón Es Tuyo",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:3004871/837fd69f6fefe16c2f91ada75c457a14",
										"link": "https://images.vix.com/prd/videos/video:mcp:3004871/837fd69f6fefe16c2f91ada75c457a14",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:783",
										"videoType": "SERIES",
										"dateModified": "2023-05-02T22:03:03.531Z",
										"dateReleased": "2014-12-06T01:00:00.000Z",
										"copyrightYear": 2014,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D"]
										}],
										"language": null,
										"title": "Mi Corazón Es Tuyo",
										"description": "La historia de una mujer que trabaja como bailarina y se convierte en niñera al conocer a un hombre viudo con 7 hijos.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Jorge Salinas",
											"roles": ["ACTOR"]
										}, {
											"name": "Adrián Uribe",
											"roles": ["ACTOR"]
										}, {
											"name": "Silvia Navarro",
											"roles": ["ACTOR"]
										}, {
											"name": "Mayrín Villanueva",
											"roles": ["ACTOR"]
										}, {
											"name": "Juan Osorio Ortiz",
											"roles": ["PRODUCER"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3004871/837fd69f6fefe16c2f91ada75c457a14",
											"link": "https://images.vix.com/prd/videos/video:mcp:3004871/837fd69f6fefe16c2f91ada75c457a14",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3004871/b7d8d08c8bf1d1a92beea15947f905a1",
											"link": "https://images.vix.com/prd/videos/video:mcp:3004871/b7d8d08c8bf1d1a92beea15947f905a1",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3004871/c328868bae75c15845b7f6373f8fcb2d",
											"link": "https://images.vix.com/prd/videos/video:mcp:3004871/c328868bae75c15845b7f6373f8fcb2d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3004871/819293b07eadb4328b3075e98fea3e26",
											"link": "https://images.vix.com/prd/videos/video:mcp:3004871/819293b07eadb4328b3075e98fea3e26",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:3004871/ed44619ee35237af058a349e6ddde9ed",
											"link": "https://images.vix.com/prd/videos/video:mcp:3004871/ed44619ee35237af058a349e6ddde9ed",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}]
						}
					}
				}, {
					"cursor": "d8945b4363ba5002981f79dd75948aaef23a13af",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "d8945b4363ba5002981f79dd75948aaef23a13af",
							"ui_module_title": "Originales Premium: Episodios gratis",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "VIDEO_CAROUSEL"
						},
						"id": "d8945b4363ba5002981f79dd75948aaef23a13af",
						"trackingId": "d8945b4363ba5002981f79dd75948aaef23a13af",
						"moduleType": "VIDEO_CAROUSEL",
						"treatment": "LANDSCAPE",
						"title": "Originales Premium: Episodios gratis",
						"caption": null,
						"landscapeFillImage": {
							"mediaType": "image/jpeg",
							"filePath": "/prd/content-list-landscape/648127b6b37289bda86990db/313fecb0776015f33d1d600b3f9e469f",
							"link": "https://images.vix.com/prd/content-list-landscape/648127b6b37289bda86990db/313fecb0776015f33d1d600b3f9e469f",
							"imageRole": "HORIZONTAL_POSTER"
						},
						"portraitFillImage": {
							"mediaType": "image/jpeg",
							"filePath": "/prd/content-list-portrait/648127abb45e19380d862891/7054a5d47b3fabc0b7ffd3b2f87e50ae",
							"link": "https://images.vix.com/prd/content-list-portrait/648127abb45e19380d862891/7054a5d47b3fabc0b7ffd3b2f87e50ae",
							"imageRole": "VERTICAL_POSTER"
						},
						"contents": {
							"totalCount": 29,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "series:mcp:4495",
								"endCursor": "series:mcp:3918"
							},
							"edges": [{
								"cursor": "series:mcp:4495",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4495",
										"ui_content_title": "Más allá de ti",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4408756/888cdc140df1b8af481b42a21eaaabcc",
										"link": "https://images.vix.com/prd/videos/video:mcp:4408756/888cdc140df1b8af481b42a21eaaabcc",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4495",
										"videoType": "SERIES",
										"dateModified": "2023-06-28T21:02:24.181Z",
										"dateReleased": "2023-05-26T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "Más allá de ti",
										"description": "Amy recibe un regalo del \"más allá”: un don que despierta su sexto sentido para ayudar a aquellos que no tienen voz y requieren justicia para descansar en paz.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Benjamín Cann",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Francisco Franco",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Arturo Ríos",
											"roles": ["ACTOR"]
										}, {
											"name": "Ariadne díaz",
											"roles": ["ACTOR"]
										}, {
											"name": "Dominika Paleta",
											"roles": ["ACTOR"]
										}, {
											"name": "Sebastián Rulli",
											"roles": ["ACTOR"]
										}, {
											"name": "Gustavo Sánchez Parra",
											"roles": ["ACTOR"]
										}, {
											"name": "Lisa Owen",
											"roles": ["ACTOR"]
										}, {
											"name": "Patricia Reyes Espíndola",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408756/6d728841dc61d4c1bd3fbb36fc32aa90",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408756/6d728841dc61d4c1bd3fbb36fc32aa90",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408756/888cdc140df1b8af481b42a21eaaabcc",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408756/888cdc140df1b8af481b42a21eaaabcc",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408756/c3aa75a52d9d01e5b1588b160ceb3812",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408756/c3aa75a52d9d01e5b1588b160ceb3812",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408756/b216a704b612f2b7c3fcd34a4e22e6be",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408756/b216a704b612f2b7c3fcd34a4e22e6be",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4408756/74d6bcab2c328ec0da4971921485dcde",
											"link": "https://images.vix.com/prd/videos/video:mcp:4408756/74d6bcab2c328ec0da4971921485dcde",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:4500",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4500",
										"ui_content_title": "Nunca tuvo miedo",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4410351/48435ae2127ca706fc25bfad5be3bc0d",
										"link": "https://images.vix.com/prd/videos/video:mcp:4410351/48435ae2127ca706fc25bfad5be3bc0d",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4500",
										"videoType": "SERIES",
										"dateModified": "2023-07-01T22:37:47.928Z",
										"dateReleased": "2023-06-30T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L", "V"]
										}],
										"language": null,
										"title": "Nunca tuvo miedo",
										"description": "Nunca tuvo miedo ofrece una mirada íntima a la vida del legendario Chalino Sánchez y su impacto en la música mexicana. Esta serie documental explora la historia y el legado de un hombre que transformó el género del corrido.",
										"genres": ["Documental"],
										"contributors": [{
											"name": "Mauricio Vélez Domínguez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Los Tucanes De Tijuana",
											"roles": ["ACTOR"]
										}, {
											"name": "Kanales",
											"roles": ["ACTOR"]
										}, {
											"name": "Ezequiel González",
											"roles": ["ACTOR"]
										}, {
											"name": "Francisco Sánchez",
											"roles": ["ACTOR"]
										}, {
											"name": "Régulo Sánchez",
											"roles": ["ACTOR"]
										}, {
											"name": "Nacho Hernández",
											"roles": ["ACTOR"]
										}, {
											"name": "Pepe Garza",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4410351/b8f3cf02d6af78853ff946a75739ca7a",
											"link": "https://images.vix.com/prd/videos/video:mcp:4410351/b8f3cf02d6af78853ff946a75739ca7a",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4410351/48435ae2127ca706fc25bfad5be3bc0d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4410351/48435ae2127ca706fc25bfad5be3bc0d",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4410351/0d61f758dff3e63352544f5a4e9e7b71",
											"link": "https://images.vix.com/prd/videos/video:mcp:4410351/0d61f758dff3e63352544f5a4e9e7b71",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4410351/20b600247f15d17b0b43c3a46635cf5f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4410351/20b600247f15d17b0b43c3a46635cf5f",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4410351/f8bb022aef621dce37322e1658159a51",
											"link": "https://images.vix.com/prd/videos/video:mcp:4410351/f8bb022aef621dce37322e1658159a51",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:4498",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4498",
										"ui_content_title": "El show, crónica de un asesinato",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4409528/484f6ba78970d04c1f9658f0a684d219",
										"link": "https://images.vix.com/prd/videos/video:mcp:4409528/484f6ba78970d04c1f9658f0a684d219",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4498",
										"videoType": "SERIES",
										"dateModified": "2023-06-26T20:23:13.316Z",
										"dateReleased": "2023-06-07T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L", "V"]
										}],
										"language": null,
										"title": "El show, crónica de un asesinato",
										"description": "Esta serie narra los hechos que llevaron a la muerte de Paco Stanley, uno de los personajes más amados de la televisión mexicana, cuyo asesinato conmocionó a un país entero.",
										"genres": ["Documental", "Crimen", "Historia"],
										"contributors": [{
											"name": "Diego Enrique Osorno",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Verónica Macías",
											"roles": ["ACTOR"]
										}, {
											"name": "Laura Valverde",
											"roles": ["ACTOR"]
										}, {
											"name": "Lilly Telléz",
											"roles": ["ACTOR"]
										}, {
											"name": "Mario Bezares",
											"roles": ["ACTOR"]
										}, {
											"name": "Juan Vargas Vázquez",
											"roles": ["ACTOR"]
										}, {
											"name": "Francisco Rodríguez",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4409528/8cbf972e0f1c28e87877faf6c19060a1",
											"link": "https://images.vix.com/prd/videos/video:mcp:4409528/8cbf972e0f1c28e87877faf6c19060a1",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4409528/484f6ba78970d04c1f9658f0a684d219",
											"link": "https://images.vix.com/prd/videos/video:mcp:4409528/484f6ba78970d04c1f9658f0a684d219",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4409528/b541e3c47f3c9691fe81f885906a3bbd",
											"link": "https://images.vix.com/prd/videos/video:mcp:4409528/b541e3c47f3c9691fe81f885906a3bbd",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4409528/c2c837fd2f1cf930db060eb044a8f262",
											"link": "https://images.vix.com/prd/videos/video:mcp:4409528/c2c837fd2f1cf930db060eb044a8f262",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4409528/20cf00fb4b543c4120f5800bd668c048",
											"link": "https://images.vix.com/prd/videos/video:mcp:4409528/20cf00fb4b543c4120f5800bd668c048",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:4157",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4157",
										"ui_content_title": "Montecristo",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4367400/99f6d5458cc0bd307490b3d9263cd89e",
										"link": "https://images.vix.com/prd/videos/video:mcp:4367400/99f6d5458cc0bd307490b3d9263cd89e",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4157",
										"videoType": "SERIES",
										"dateModified": "2023-06-27T16:01:55.522Z",
										"dateReleased": "2023-04-14T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "Montecristo",
										"description": "¿Quién es Alejandro Montecristo? Desde su reciente llegada, esa es la pregunta que las personas más selectas de la capital española se hacen. Nadie sospecha que el éxito y el dinero no le interesan, lo único que le importa es vengarse de sus enemigos.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Lidia Fraga",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Jacobo Díaz",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Wlliam Levy",
											"roles": ["ACTOR"]
										}, {
											"name": "Roberto Enríquez",
											"roles": ["ACTOR"]
										}, {
											"name": "Juan Fernández",
											"roles": ["ACTOR"]
										}, {
											"name": "Esmeralda Pimentel",
											"roles": ["ACTOR"]
										}, {
											"name": "Silvia Abascal",
											"roles": ["ACTOR"]
										}, {
											"name": "Guiomar Puerta",
											"roles": ["ACTOR"]
										}, {
											"name": "Franky Martín",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4367400/42b6d3103ddc1597480df310afbce146",
											"link": "https://images.vix.com/prd/videos/video:mcp:4367400/42b6d3103ddc1597480df310afbce146",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4367400/99f6d5458cc0bd307490b3d9263cd89e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4367400/99f6d5458cc0bd307490b3d9263cd89e",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4367400/8010f43e9d9073c88fbdbb09a9fb919d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4367400/8010f43e9d9073c88fbdbb09a9fb919d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4367400/751735d392455f384384d41927d72c62",
											"link": "https://images.vix.com/prd/videos/video:mcp:4367400/751735d392455f384384d41927d72c62",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4367400/3e444e1de6670b1bca5626dcd450a2c4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4367400/3e444e1de6670b1bca5626dcd450a2c4",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:4487",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4487",
										"ui_content_title": "Senda prohibida",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4407350/af4e8492775dc6cef75aa29c935a5e44",
										"link": "https://images.vix.com/prd/videos/video:mcp:4407350/af4e8492775dc6cef75aa29c935a5e44",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4487",
										"videoType": "SERIES",
										"dateModified": "2023-06-29T18:29:42.178Z",
										"dateReleased": "2023-06-23T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L", "V"]
										}],
										"language": null,
										"title": "Senda prohibida",
										"description": "Roberto se compromete con Corina, una hermosa bailarina de cabaret, al mismo tiempo que Federico, su padre, conoce a Nora, una bella empleada de una florería, quien guarda un secreto que podría provocar una guerra entre ambos hombres.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Gustavo Ron",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Giselle González",
											"roles": ["PRODUCER"]
										}, {
											"name": "Raúl Méndez",
											"roles": ["ACTOR"]
										}, {
											"name": "Ela Velden",
											"roles": ["ACTOR"]
										}, {
											"name": "Iliana Fox",
											"roles": ["ACTOR"]
										}, {
											"name": "Danny Perea",
											"roles": ["ACTOR"]
										}, {
											"name": "José Manuel Rincón",
											"roles": ["ACTOR"]
										}, {
											"name": "Plutarco Haza",
											"roles": ["ACTOR"]
										}, {
											"name": "Bernardo Flores",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4407350/41248e580e64b7aee5f513c4c6ac7879",
											"link": "https://images.vix.com/prd/videos/video:mcp:4407350/41248e580e64b7aee5f513c4c6ac7879",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4407350/af4e8492775dc6cef75aa29c935a5e44",
											"link": "https://images.vix.com/prd/videos/video:mcp:4407350/af4e8492775dc6cef75aa29c935a5e44",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4407350/56459221b66c6f68eb65f24f054a3ac4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4407350/56459221b66c6f68eb65f24f054a3ac4",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4407350/1701821c79be79c004d5a23d7a722bd7",
											"link": "https://images.vix.com/prd/videos/video:mcp:4407350/1701821c79be79c004d5a23d7a722bd7",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4407350/d16991c54f5a77ad82dd57e10b08b5ba",
											"link": "https://images.vix.com/prd/videos/video:mcp:4407350/d16991c54f5a77ad82dd57e10b08b5ba",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3918",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3918",
										"ui_content_title": "Cenizas de la Gloria",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4306517/4761393d0a2bee95dfc6d0064319982c",
										"link": "https://images.vix.com/prd/videos/video:mcp:4306517/4761393d0a2bee95dfc6d0064319982c",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3918",
										"videoType": "SERIES",
										"dateModified": "2023-07-11T17:16:08.055Z",
										"dateReleased": "2023-08-10T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "Cenizas de la Gloria",
										"description": "Cenizas de la gloria explora la peculiar relación entre el deporte y el crimen. Los triunfos y las caídas de seis atletas ofrecen un retrato del México contemporáneo. Sus historias revelan que no hay partido más intenso que la vida.",
										"genres": ["Documental"],
										"contributors": [{
											"name": "Hatuey Viveros",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Julio López",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Elvio Paolorosso",
											"roles": ["ACTOR"]
										}, {
											"name": "Pablo Zeballos",
											"roles": ["ACTOR"]
										}, {
											"name": "Salvador Cabañas",
											"roles": ["ACTOR"]
										}, {
											"name": "Raúl Criollo",
											"roles": ["ACTOR"]
										}, {
											"name": "Elmer Mendoza",
											"roles": ["ACTOR"]
										}, {
											"name": "Bibiana Belsasso",
											"roles": ["ACTOR"]
										}, {
											"name": "Rodolfo Chavez",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4306517/e989c7eb008440cca5ee65cdc49a70c5",
											"link": "https://images.vix.com/prd/videos/video:mcp:4306517/e989c7eb008440cca5ee65cdc49a70c5",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4306517/4761393d0a2bee95dfc6d0064319982c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4306517/4761393d0a2bee95dfc6d0064319982c",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4306517/1b3198376f0cd7341e8019c7bc9be571",
											"link": "https://images.vix.com/prd/videos/video:mcp:4306517/1b3198376f0cd7341e8019c7bc9be571",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4306517/352494a4fd8543eef6bbf217343592f0",
											"link": "https://images.vix.com/prd/videos/video:mcp:4306517/352494a4fd8543eef6bbf217343592f0",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4306517/cc3c8fbd4e77b31b96f717364c973921",
											"link": "https://images.vix.com/prd/videos/video:mcp:4306517/cc3c8fbd4e77b31b96f717364c973921",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}]
						}
					}
				}, {
					"cursor": "d261ede5309f04dd54e0cc6844405501c7eb617a",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "d261ede5309f04dd54e0cc6844405501c7eb617a",
							"ui_module_title": "Noticias y deportes en vivo",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "LIVE_VIDEO_CAROUSEL"
						},
						"id": "d261ede5309f04dd54e0cc6844405501c7eb617a",
						"trackingId": "d261ede5309f04dd54e0cc6844405501c7eb617a",
						"moduleType": "LIVE_VIDEO_CAROUSEL",
						"title": "Noticias y deportes en vivo",
						"treatment": "LANDSCAPE",
						"contents": {
							"totalCount": 9,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "channel:mcp:callsign:frequancy-News-24-7",
								"endCursor": "channel:mcp:callsign:Frequency_Real_Madrid_TV"
							},
							"edges": [{
								"cursor": "channel:mcp:callsign:frequancy-News-24-7",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "channel:mcp:callsign:frequancy-News-24-7",
										"ui_content_title": "Noticias Univision 24-7 Mediodía",
										"ui_content_type": "EPGChannel",
										"ui_content_group": "promo"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/channel/61f83680771641ece747bada/2be1ed9ee95b850da79c61a42e426d3d",
										"link": "https://images.vix.com/prd/channel/61f83680771641ece747bada/2be1ed9ee95b850da79c61a42e426d3d",
										"imageRole": "CHANNEL_LOGO"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/channel-landscape/63e41c73e2fef0b086d13f8f/30672bb27caf16c91ef19f34bd57275c",
										"link": "https://images.vix.com/prd/channel-landscape/63e41c73e2fef0b086d13f8f/30672bb27caf16c91ef19f34bd57275c",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"channelId": "channel:mcp:callsign:frequancy-News-24-7",
									"channel": {
										"channelAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"badges": [],
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:frequancy-News-24-7",
												"channel_title": "Noticias Univision 24/7",
												"channel_ads_key": "noticias_univision_247",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": "news",
												"video_genres_first": "news",
												"video_title": "Noticias Univision 24-7 Mediodía",
												"video_language": "es",
												"video_id_external": "transmission:mcp:externalid:Not07242023130000Univision_42603",
												"video_content_vertical": "news",
												"video_supplier": ["univision", "televisa"],
												"video_type": "episode",
												"video_rating": "TV-14"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "700",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/noticias_univision_247",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-frequancy-News-24-7",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/noticias_univision_247",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequancy-news-24-7%26channel_title%3Dnoticias%20univision%2024/7%26channel_ads_key%3Dnoticias_univision_247%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dnews%26video_genres_first%3Dnews%26video_title%3Dnoticias%20univision%2024-7%20mediodia%26video_language%3Des%26video_id_external%3Dtransmissionmcpexternalidnot07242023130000univision_42603%26video_content_vertical%3Dnews%26video_supplier%3Dunivision%2Ctelevisa%26video_type%3Depisode%26video_rating%3Dtv-14"
												}
											}
										}
									},
									"schedule": {
										"id": "transmission:mcp:id:e6maJIvpJJqxC7tmA4R27A",
										"title": "Noticias Univision 24-7 Mediodía",
										"startDate": "2023-07-24T17:00:00.000Z",
										"endDate": "2023-07-24T18:00:00.000Z",
										"imageAssets": [],
										"vodAvailable": false,
										"video": null,
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:frequancy-News-24-7",
												"channel_title": "Noticias Univision 24/7",
												"channel_ads_key": "noticias_univision_247",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": "news",
												"video_genres_first": "news",
												"video_title": "Noticias Univision 24-7 Mediodía",
												"video_language": "es",
												"video_id_external": "transmission:mcp:externalid:Not07242023130000Univision_42603",
												"video_content_vertical": "news",
												"video_supplier": ["univision", "televisa"],
												"video_type": "episode",
												"video_rating": "TV-14"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "700",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/noticias_univision_247",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-frequancy-News-24-7",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/noticias_univision_247",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequancy-news-24-7%26channel_title%3Dnoticias%20univision%2024/7%26channel_ads_key%3Dnoticias_univision_247%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dnews%26video_genres_first%3Dnews%26video_title%3Dnoticias%20univision%2024-7%20mediodia%26video_language%3Des%26video_id_external%3Dtransmissionmcpexternalidnot07242023130000univision_42603%26video_content_vertical%3Dnews%26video_supplier%3Dunivision%2Ctelevisa%26video_type%3Depisode%26video_rating%3Dtv-14"
												}
											}
										}
									},
									"stream": {
										"mcpId": "adstGgBYdoQENykn"
									}
								}
							}, {
								"cursor": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Nueva_York",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Nueva_York",
										"ui_content_title": "Noticias 41 a las 12:30pm",
										"ui_content_type": "EPGChannel",
										"ui_content_group": "promo"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/channel/64aecae656c9b5a4b74a3786/14bdbcd4a8653ebf33058926dbe5dc52",
										"link": "https://images.vix.com/prd/channel/64aecae656c9b5a4b74a3786/14bdbcd4a8653ebf33058926dbe5dc52",
										"imageRole": "CHANNEL_LOGO"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/channel-landscape/64aecb003f9b60858da7c705/8adb0d5ab53ef9de296ddc0eb19da969",
										"link": "https://images.vix.com/prd/channel-landscape/64aecb003f9b60858da7c705/8adb0d5ab53ef9de296ddc0eb19da969",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"channelId": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Nueva_York",
									"channel": {
										"channelAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"badges": [],
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Nueva_York",
												"channel_title": "Noticias Univision 24/7 – Nueva York",
												"channel_ads_key": "noticias_univision_24_7_nueva_york",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "701",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T17:30:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_nueva_york",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Local_Noticias_Univision_24_7_Nueva_York",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_nueva_york",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignlocal_noticias_univision_24_7_nueva_york%26channel_title%3Dnoticias%20univision%2024/7%20–%20nueva%20york%26channel_ads_key%3Dnoticias_univision_24_7_nueva_york%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse"
												}
											}
										}
									},
									"schedule": {
										"id": "transmission:mcp:id:5mGIPcmELgU1_KpZv-sa9Q",
										"title": "Noticias 41 a las 12:30pm",
										"startDate": "2023-07-24T17:00:00.000Z",
										"endDate": "2023-07-24T17:30:00.000Z",
										"imageAssets": [],
										"vodAvailable": false,
										"video": null,
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Nueva_York",
												"channel_title": "Noticias Univision 24/7 – Nueva York",
												"channel_ads_key": "noticias_univision_24_7_nueva_york",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "701",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T17:30:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_nueva_york",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Local_Noticias_Univision_24_7_Nueva_York",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_nueva_york",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignlocal_noticias_univision_24_7_nueva_york%26channel_title%3Dnoticias%20univision%2024/7%20–%20nueva%20york%26channel_ads_key%3Dnoticias_univision_24_7_nueva_york%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse"
												}
											}
										}
									},
									"stream": {
										"mcpId": "adstJG1vdA3LN3yg"
									}
								}
							}, {
								"cursor": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Miami",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Miami",
										"ui_content_title": "Noticias Univision 24-7 Mediodía",
										"ui_content_type": "EPGChannel",
										"ui_content_group": "promo"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/channel/64a5d413eaf3d1ceba5ab005/35b2aadf3f782a6623a0f8488d7644c8",
										"link": "https://images.vix.com/prd/channel/64a5d413eaf3d1ceba5ab005/35b2aadf3f782a6623a0f8488d7644c8",
										"imageRole": "CHANNEL_LOGO"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/channel-landscape/64a5d38a2755d59ae5d689bd/0a957636722aadf28317be797e207f98",
										"link": "https://images.vix.com/prd/channel-landscape/64a5d38a2755d59ae5d689bd/0a957636722aadf28317be797e207f98",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"channelId": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Miami",
									"channel": {
										"channelAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"badges": [],
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Miami",
												"channel_title": "Noticias Univision 24/7 – Miami",
												"channel_ads_key": "noticias_univision_24_7_miami",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "702",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_miami",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Local_Noticias_Univision_24_7_Miami",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_miami",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignlocal_noticias_univision_24_7_miami%26channel_title%3Dnoticias%20univision%2024/7%20–%20miami%26channel_ads_key%3Dnoticias_univision_24_7_miami%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse"
												}
											}
										}
									},
									"schedule": {
										"id": "transmission:mcp:id:xDuoQ5RTqmOB287Tw4P3Tg",
										"title": "Noticias Univision 24-7 Mediodía",
										"startDate": "2023-07-24T17:00:00.000Z",
										"endDate": "2023-07-24T18:00:00.000Z",
										"imageAssets": [],
										"vodAvailable": false,
										"video": null,
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Local_Noticias_Univision_24_7_Miami",
												"channel_title": "Noticias Univision 24/7 – Miami",
												"channel_ads_key": "noticias_univision_24_7_miami",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "702",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_miami",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Local_Noticias_Univision_24_7_Miami",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/noticias_univision_24_7_miami",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignlocal_noticias_univision_24_7_miami%26channel_title%3Dnoticias%20univision%2024/7%20–%20miami%26channel_ads_key%3Dnoticias_univision_24_7_miami%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse"
												}
											}
										}
									},
									"stream": {
										"mcpId": "adstGLxOqGK1qXgB"
									}
								}
							}, {
								"cursor": "channel:mcp:callsign:Frequency_N_Plus_MEX",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "channel:mcp:callsign:Frequency_N_Plus_MEX",
										"ui_content_title": "Despierta",
										"ui_content_type": "EPGChannel",
										"ui_content_group": "promo"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/channel/63ea420d27b695a94b1d428b/3830196ffbfe732108455528f7103b6b",
										"link": "https://images.vix.com/prd/channel/63ea420d27b695a94b1d428b/3830196ffbfe732108455528f7103b6b",
										"imageRole": "CHANNEL_LOGO"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/channel-landscape/6452ce41f1d11ccf79f126d9/17e2c4455a50a0a603ebdeea7f2f58d5",
										"link": "https://images.vix.com/prd/channel-landscape/6452ce41f1d11ccf79f126d9/17e2c4455a50a0a603ebdeea7f2f58d5",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"channelId": "channel:mcp:callsign:Frequency_N_Plus_MEX",
									"channel": {
										"channelAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"badges": [],
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Frequency_N_Plus_MEX",
												"channel_title": "N+",
												"channel_ads_key": "n_mas_global",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": "entertainment",
												"video_genres_first": "entertainment",
												"video_title": "Despierta",
												"video_language": "es",
												"video_id_external": "transmission:mcp:externalid:ps-1684176795554",
												"video_content_vertical": "entertainment",
												"video_supplier": "frequency",
												"video_type": "episode",
												"video_rating": "TV-14"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "712",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/n_mas_global",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Frequency_N_Plus_MEX",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/n_mas_global",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequency_n_plus_mex%26channel_title%3Dn%26channel_ads_key%3Dn_mas_global%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dentertainment%26video_genres_first%3Dentertainment%26video_title%3Ddespierta%26video_language%3Des%26video_id_external%3Dtransmissionmcpexternalidps-1684176795554%26video_content_vertical%3Dentertainment%26video_supplier%3Dfrequency%26video_type%3Depisode%26video_rating%3Dtv-14"
												}
											}
										}
									},
									"schedule": {
										"id": "transmission:mcp:id:PuCbFgScQRfPIm5VxWWQ4Q",
										"title": "Despierta",
										"startDate": "2023-07-24T17:00:00.000Z",
										"endDate": "2023-07-24T18:00:00.000Z",
										"imageAssets": [],
										"vodAvailable": false,
										"video": null,
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Frequency_N_Plus_MEX",
												"channel_title": "N+",
												"channel_ads_key": "n_mas_global",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": "entertainment",
												"video_genres_first": "entertainment",
												"video_title": "Despierta",
												"video_language": "es",
												"video_id_external": "transmission:mcp:externalid:ps-1684176795554",
												"video_content_vertical": "entertainment",
												"video_supplier": "frequency",
												"video_type": "episode",
												"video_rating": "TV-14"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "712",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/n_mas_global",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Frequency_N_Plus_MEX",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/n_mas_global",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequency_n_plus_mex%26channel_title%3Dn%26channel_ads_key%3Dn_mas_global%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dentertainment%26video_genres_first%3Dentertainment%26video_title%3Ddespierta%26video_language%3Des%26video_id_external%3Dtransmissionmcpexternalidps-1684176795554%26video_content_vertical%3Dentertainment%26video_supplier%3Dfrequency%26video_type%3Depisode%26video_rating%3Dtv-14"
												}
											}
										}
									},
									"stream": {
										"mcpId": "adstGLxOqGApaXgB"
									}
								}
							}, {
								"cursor": "channel:mcp:callsign:Frequency_ZONA_TUDN_US_PR",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "channel:mcp:callsign:Frequency_ZONA_TUDN_US_PR",
										"ui_content_title": "Kontacto",
										"ui_content_type": "EPGChannel",
										"ui_content_group": "promo"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/channel/6244daca750759417e4d5be9/10696ab99e6bd31833b8e8ce5216c5de",
										"link": "https://images.vix.com/prd/channel/6244daca750759417e4d5be9/10696ab99e6bd31833b8e8ce5216c5de",
										"imageRole": "CHANNEL_LOGO"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/channel-landscape/649f289aa549df2d06eb8f76/42c968bf75b1640e6a249026935c20af",
										"link": "https://images.vix.com/prd/channel-landscape/649f289aa549df2d06eb8f76/42c968bf75b1640e6a249026935c20af",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"channelId": "channel:mcp:callsign:Frequency_ZONA_TUDN_US_PR",
									"channel": {
										"channelAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"badges": [],
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Frequency_ZONA_TUDN_US_PR",
												"channel_title": "Zona TUDN",
												"channel_ads_key": "zona_tudn_uspr",
												"content_group": "promo",
												"epg_channel_type": "GAME",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": ["entertainment", "sports"],
												"video_genres_first": "entertainment",
												"video_title": "Kontacto",
												"video_language": "es",
												"video_content_vertical": ["entertainment", "sports"],
												"video_supplier": ["frequency", "televisa"],
												"video_type": "episode",
												"video_rating": "TV-14"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "800",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/zona_tudn_uspr",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Frequency_ZONA_TUDN_US_PR",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/zona_tudn_uspr",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequency_zona_tudn_us_pr%26channel_title%3Dzona%20tudn%26channel_ads_key%3Dzona_tudn_uspr%26content_group%3Dpromo%26epg_channel_type%3Dgame%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dentertainment%2Csports%26video_genres_first%3Dentertainment%26video_title%3Dkontacto%26video_language%3Des%26video_content_vertical%3Dentertainment%2Csports%26video_supplier%3Dfrequency%2Ctelevisa%26video_type%3Depisode%26video_rating%3Dtv-14"
												}
											}
										}
									},
									"schedule": {
										"id": "transmission:mcp:id:YdTmungP2qhw8JTtK28cxQ",
										"title": "Kontacto",
										"startDate": "2023-07-24T17:00:00.000Z",
										"endDate": "2023-07-24T18:00:00.000Z",
										"imageAssets": [],
										"vodAvailable": false,
										"video": null,
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Frequency_ZONA_TUDN_US_PR",
												"channel_title": "Zona TUDN",
												"channel_ads_key": "zona_tudn_uspr",
												"content_group": "promo",
												"epg_channel_type": "GAME",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": ["entertainment", "sports"],
												"video_genres_first": "entertainment",
												"video_title": "Kontacto",
												"video_language": "es",
												"video_content_vertical": ["entertainment", "sports"],
												"video_supplier": ["frequency", "televisa"],
												"video_type": "episode",
												"video_rating": "TV-14"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "800",
												"channel_video_schedule_start_date": "2023-07-24T17:00:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:00:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/zona_tudn_uspr",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Frequency_ZONA_TUDN_US_PR",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/zona_tudn_uspr",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequency_zona_tudn_us_pr%26channel_title%3Dzona%20tudn%26channel_ads_key%3Dzona_tudn_uspr%26content_group%3Dpromo%26epg_channel_type%3Dgame%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dentertainment%2Csports%26video_genres_first%3Dentertainment%26video_title%3Dkontacto%26video_language%3Des%26video_content_vertical%3Dentertainment%2Csports%26video_supplier%3Dfrequency%2Ctelevisa%26video_type%3Depisode%26video_rating%3Dtv-14"
												}
											}
										}
									},
									"stream": {
										"mcpId": "adstlArXq779qe2v"
									}
								}
							}, {
								"cursor": "channel:mcp:callsign:Frequency_Real_Madrid_TV",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "channel:mcp:callsign:Frequency_Real_Madrid_TV",
										"ui_content_title": "Historia que tú hiciste",
										"ui_content_type": "EPGChannel",
										"ui_content_group": "promo"
									},
									"logoImage": {
										"mediaType": "image/png",
										"filePath": "/prd/channel/641ccecb9f5877df8f6ad9c4/e341e9de4ef4403db9b00d7d8cbea71e",
										"link": "https://images.vix.com/prd/channel/641ccecb9f5877df8f6ad9c4/e341e9de4ef4403db9b00d7d8cbea71e",
										"imageRole": "CHANNEL_LOGO"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/channel-landscape/642331e4e99cb4942ded7a7a/febde6438893b7f1ec9d8a7f83384f0a",
										"link": "https://images.vix.com/prd/channel-landscape/642331e4e99cb4942ded7a7a/febde6438893b7f1ec9d8a7f83384f0a",
										"imageRole": "HORIZONTAL_POSTER"
									},
									"channelId": "channel:mcp:callsign:Frequency_Real_Madrid_TV",
									"channel": {
										"channelAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"badges": [],
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Frequency_Real_Madrid_TV",
												"channel_title": "Real Madrid TV",
												"channel_ads_key": "real_madrid_tv",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": "entertainment",
												"video_genres_first": "entertainment",
												"video_title": "Historia que tú hiciste",
												"video_language": "es",
												"video_id_external": "transmission:mcp:externalid:SH030529480000",
												"video_content_vertical": ["entertainment", "sports"],
												"video_supplier": ["frequency", "real madrid"],
												"video_type": "Sports non-event",
												"video_rating": "TV-14",
												"video_content_genres": "sports"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "810",
												"channel_video_schedule_start_date": "2023-07-24T16:30:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:30:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/real_madrid_tv",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Frequency_Real_Madrid_TV",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/real_madrid_tv",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequency_real_madrid_tv%26channel_title%3Dreal%20madrid%20tv%26channel_ads_key%3Dreal_madrid_tv%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dentertainment%26video_genres_first%3Dentertainment%26video_title%3Dhistoria%20que%20tu%20hiciste%26video_language%3Des%26video_id_external%3Dtransmissionmcpexternalidsh030529480000%26video_content_vertical%3Dentertainment%2Csports%26video_supplier%3Dfrequency%2Creal%20madrid%26video_type%3Dsports%20non-event%26video_rating%3Dtv-14%26video_content_genres%3Dsports"
												}
											}
										}
									},
									"schedule": {
										"id": "transmission:mcp:id:cZdg7KRCHlZxo8YsRPaZ6g",
										"title": "Historia que tú hiciste",
										"startDate": "2023-07-24T16:30:00.000Z",
										"endDate": "2023-07-24T18:30:00.000Z",
										"imageAssets": [],
										"vodAvailable": false,
										"video": null,
										"trackingMetadata": {
											"sharedMetadataJson": {
												"stream_type": "live",
												"channel_id": "channel:mcp:callsign:Frequency_Real_Madrid_TV",
												"channel_title": "Real Madrid TV",
												"channel_ads_key": "real_madrid_tv",
												"content_group": "promo",
												"epg_channel_type": "FAST",
												"is_epg": "true",
												"navigation_section": "ondemand2",
												"carousel_id": "",
												"carousel_title": "",
												"is_recommendation": "false",
												"video_genres": "entertainment",
												"video_genres_first": "entertainment",
												"video_title": "Historia que tú hiciste",
												"video_language": "es",
												"video_id_external": "transmission:mcp:externalid:SH030529480000",
												"video_content_vertical": ["entertainment", "sports"],
												"video_supplier": ["frequency", "real madrid"],
												"video_type": "Sports non-event",
												"video_rating": "TV-14",
												"video_content_genres": "sports"
											},
											"advertisingMetadataJson": {},
											"analyticsMetadataJson": {
												"channel_number": "810",
												"channel_video_schedule_start_date": "2023-07-24T16:30:00.000Z",
												"channel_video_schedule_end_date": "2023-07-24T18:30:00.000Z"
											},
											"advertisingMetadata": {
												"adUnit": "/6881/vix.tv/viewer/live/ios/real_madrid_tv",
												"adConfiguration": {
													"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
													"env": "vp",
													"impl": "s",
													"correlator": "",
													"tfcd": "0",
													"npa": "0",
													"gdfp_req": "1",
													"sz": "640x480",
													"unviewed_position_start": "1",
													"vad_type": "linear",
													"vpa": "1",
													"url": "https://www.vix.com",
													"description_url": "https://www.vix.com/canales/channel-callsign-Frequency_Real_Madrid_TV",
													"vconp": "1",
													"ss_req": "1",
													"vpi": "1",
													"iu": "/6881/vix.tv/viewer/live/ios/real_madrid_tv",
													"cust_params": "stream_type%3Dlive%26channel_id%3Dchannelmcpcallsignfrequency_real_madrid_tv%26channel_title%3Dreal%20madrid%20tv%26channel_ads_key%3Dreal_madrid_tv%26content_group%3Dpromo%26epg_channel_type%3Dfast%26is_epg%3Dtrue%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26video_genres%3Dentertainment%26video_genres_first%3Dentertainment%26video_title%3Dhistoria%20que%20tu%20hiciste%26video_language%3Des%26video_id_external%3Dtransmissionmcpexternalidsh030529480000%26video_content_vertical%3Dentertainment%2Csports%26video_supplier%3Dfrequency%2Creal%20madrid%26video_type%3Dsports%20non-event%26video_rating%3Dtv-14%26video_content_genres%3Dsports"
												}
											}
										}
									},
									"stream": {
										"mcpId": "adstngeBaw6JdkY5"
									}
								}
							}]
						}
					}
				}, {
					"cursor": "d9f1839fea08c9ec8beed1be955e977bb4cc6de7",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "d9f1839fea08c9ec8beed1be955e977bb4cc6de7",
							"ui_module_title": "Próximos partidos",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "SPORTS_EVENT_CAROUSEL"
						},
						"id": "d9f1839fea08c9ec8beed1be955e977bb4cc6de7",
						"trackingId": "d9f1839fea08c9ec8beed1be955e977bb4cc6de7",
						"moduleType": "SPORTS_EVENT_CAROUSEL",
						"treatment": "LANDSCAPE",
						"title": "Próximos partidos",
						"sportId": null,
						"isLive": false,
						"leagueId": null,
						"sportsEventCarouselType": "LIVE_AND_UPCOMING",
						"contents": {
							"totalCount": 100,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "transmission:matchid:UEFAWU192309",
								"endCursor": "transmission:matchid:2355584"
							},
							"edges": [{
								"cursor": "transmission:matchid:UEFAWU192309",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:UEFAWU192309",
										"ui_content_title": "Austria vs Bélgica",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/63f63721a0366f693938d75d/6058b49b593cc663f5ff36cf01c75fa9",
										"link": "https://images.vix.com/prd/team-logo/63f63721a0366f693938d75d/6058b49b593cc663f5ff36cf01c75fa9",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/63f637b0995325280bf3709d/fe958c1e937ea18114160d09d1957364",
										"link": "https://images.vix.com/prd/team-logo/63f637b0995325280bf3709d/fe958c1e937ea18114160d09d1957364",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:UEFAWU192309",
									"sportsEvent": {
										"id": "transmission:matchid:UEFAWU192309",
										"name": "Austria vs Bélgica",
										"badges": [],
										"tournament": {
											"id": "UEFAWU19",
											"name": "UEFA European Womens U-19",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst82m0dZ60dEnv"
											},
											"kickoffDate": "2023-07-24T15:30:00.000Z",
											"scheduledStartTime": "2023-07-24T15:15:00.000Z",
											"scheduledEndTime": "2023-07-24T17:50:00.000Z",
											"streamId": "adst82m0dZ60dEnv",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-UEFAWU192309",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchiduefawu192309%26sports_event_mcp_id%3Dtransmissionmcpeventid6094976%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Daustria%20vs%20belgica%26sports_home_team%3Daustria%26sports_away_team%3Dbelgica%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Duefawu19%26sports_league_name%3Duefa%20european%20womens%20u-19%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:UEFAWU192309",
													"sports_event_mcp_id": "transmission:mcp:eventid:6094976",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Austria vs Bélgica",
													"sports_home_team": "Austria",
													"sports_away_team": "Bélgica",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "UEFAWU19",
													"sports_league_name": "UEFA European Womens U-19",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "515",
											"name": "Austria",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/63f63721a0366f693938d75d/6058b49b593cc663f5ff36cf01c75fa9",
												"link": "https://images.vix.com/prd/team-logo/63f63721a0366f693938d75d/6058b49b593cc663f5ff36cf01c75fa9",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "360",
											"name": "Bélgica",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/63f637b0995325280bf3709d/fe958c1e937ea18114160d09d1957364",
												"link": "https://images.vix.com/prd/team-logo/63f637b0995325280bf3709d/fe958c1e937ea18114160d09d1957364",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946?tr=w-1800,h-1020,:oi-/prd/team-logo/63f63721a0366f693938d75d/6058b49b593cc663f5ff36cf01c75fa9,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/63f637b0995325280bf3709d/fe958c1e937ea18114160d09d1957364,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:UEFAWU192310",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:UEFAWU192310",
										"ui_content_title": "Países Bajos vs Alemania",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5cae548ea0637010ab496/3e0cb32c2e64be267a612d8c49b9e129",
										"link": "https://images.vix.com/prd/team-logo/64b5cae548ea0637010ab496/3e0cb32c2e64be267a612d8c49b9e129",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5c9ee65a468a2b0220202/926c1330d5f070847fdd3b23c5053fc5",
										"link": "https://images.vix.com/prd/team-logo/64b5c9ee65a468a2b0220202/926c1330d5f070847fdd3b23c5053fc5",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:UEFAWU192310",
									"sportsEvent": {
										"id": "transmission:matchid:UEFAWU192310",
										"name": "Países Bajos vs Alemania",
										"badges": [],
										"tournament": {
											"id": "UEFAWU19",
											"name": "UEFA European Womens U-19",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstWMwraRQ4dZzR"
											},
											"kickoffDate": "2023-07-24T15:30:00.000Z",
											"scheduledStartTime": "2023-07-24T15:15:00.000Z",
											"scheduledEndTime": "2023-07-24T17:50:00.000Z",
											"streamId": "adstWMwraRQ4dZzR",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-UEFAWU192310",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchiduefawu192310%26sports_event_mcp_id%3Dtransmissionmcpeventid6094977%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dpaises%20bajos%20vs%20alemania%26sports_home_team%3Dpaises%20bajos%26sports_away_team%3Dalemania%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Duefawu19%26sports_league_name%3Duefa%20european%20womens%20u-19%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:UEFAWU192310",
													"sports_event_mcp_id": "transmission:mcp:eventid:6094977",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Países Bajos vs Alemania",
													"sports_home_team": "Países Bajos",
													"sports_away_team": "Alemania",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "UEFAWU19",
													"sports_league_name": "UEFA European Womens U-19",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "WC22Q04",
											"name": "Países Bajos",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5cae548ea0637010ab496/3e0cb32c2e64be267a612d8c49b9e129",
												"link": "https://images.vix.com/prd/team-logo/64b5cae548ea0637010ab496/3e0cb32c2e64be267a612d8c49b9e129",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "357",
											"name": "Alemania",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5c9ee65a468a2b0220202/926c1330d5f070847fdd3b23c5053fc5",
												"link": "https://images.vix.com/prd/team-logo/64b5c9ee65a468a2b0220202/926c1330d5f070847fdd3b23c5053fc5",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946?tr=w-1800,h-1020,:oi-/prd/team-logo/64b5cae548ea0637010ab496/3e0cb32c2e64be267a612d8c49b9e129,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64b5c9ee65a468a2b0220202/926c1330d5f070847fdd3b23c5053fc5,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:UEFAWU192312",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:UEFAWU192312",
										"ui_content_title": "España vs República Checa",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5cb4600a9bf71af8c9bb7/a3a7e69dbdba4a37b64bd8272a617807",
										"link": "https://images.vix.com/prd/team-logo/64b5cb4600a9bf71af8c9bb7/a3a7e69dbdba4a37b64bd8272a617807",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/63f63a9304b25e1ca3038cde/8def3184732ad4f8d8d823000de3df21",
										"link": "https://images.vix.com/prd/team-logo/63f63a9304b25e1ca3038cde/8def3184732ad4f8d8d823000de3df21",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:UEFAWU192312",
									"sportsEvent": {
										"id": "transmission:matchid:UEFAWU192312",
										"name": "España vs República Checa",
										"badges": [],
										"tournament": {
											"id": "UEFAWU19",
											"name": "UEFA European Womens U-19",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstZ0JwdOjzqyxp"
											},
											"kickoffDate": "2023-07-24T18:30:00.000Z",
											"scheduledStartTime": "2023-07-24T18:15:00.000Z",
											"scheduledEndTime": "2023-07-24T20:50:00.000Z",
											"streamId": "adstZ0JwdOjzqyxp",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-UEFAWU192312",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchiduefawu192312%26sports_event_mcp_id%3Dtransmissionmcpeventid6094957%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Despana%20vs%20republica%20checa%26sports_home_team%3Despana%26sports_away_team%3Drepublica%20checa%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Duefawu19%26sports_league_name%3Duefa%20european%20womens%20u-19%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:UEFAWU192312",
													"sports_event_mcp_id": "transmission:mcp:eventid:6094957",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "España vs República Checa",
													"sports_home_team": "España",
													"sports_away_team": "República Checa",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "UEFAWU19",
													"sports_league_name": "UEFA European Womens U-19",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "118",
											"name": "España",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5cb4600a9bf71af8c9bb7/a3a7e69dbdba4a37b64bd8272a617807",
												"link": "https://images.vix.com/prd/team-logo/64b5cb4600a9bf71af8c9bb7/a3a7e69dbdba4a37b64bd8272a617807",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "367",
											"name": "República Checa",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/63f63a9304b25e1ca3038cde/8def3184732ad4f8d8d823000de3df21",
												"link": "https://images.vix.com/prd/team-logo/63f63a9304b25e1ca3038cde/8def3184732ad4f8d8d823000de3df21",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946?tr=w-1800,h-1020,:oi-/prd/team-logo/64b5cb4600a9bf71af8c9bb7/a3a7e69dbdba4a37b64bd8272a617807,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/63f63a9304b25e1ca3038cde/8def3184732ad4f8d8d823000de3df21,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:UEFAWU192311",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:UEFAWU192311",
										"ui_content_title": "Francia vs Islandia",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5c9cf5a75a1a73751b3c9/965d9f2e2b51ee83d34c2ad23f9ee570",
										"link": "https://images.vix.com/prd/team-logo/64b5c9cf5a75a1a73751b3c9/965d9f2e2b51ee83d34c2ad23f9ee570",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/63f63c0894ee426e3da38e83/4c824cf1a99224ff4fa5a3b0e33eefc2",
										"link": "https://images.vix.com/prd/team-logo/63f63c0894ee426e3da38e83/4c824cf1a99224ff4fa5a3b0e33eefc2",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:UEFAWU192311",
									"sportsEvent": {
										"id": "transmission:matchid:UEFAWU192311",
										"name": "Francia vs Islandia",
										"badges": [],
										"tournament": {
											"id": "UEFAWU19",
											"name": "UEFA European Womens U-19",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst9BQ6dL29NxO0"
											},
											"kickoffDate": "2023-07-24T18:30:00.000Z",
											"scheduledStartTime": "2023-07-24T18:15:00.000Z",
											"scheduledEndTime": "2023-07-24T20:50:00.000Z",
											"streamId": "adst9BQ6dL29NxO0",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-UEFAWU192311",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchiduefawu192311%26sports_event_mcp_id%3Dtransmissionmcpeventid6094956%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dfrancia%20vs%20islandia%26sports_home_team%3Dfrancia%26sports_away_team%3Dislandia%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Duefawu19%26sports_league_name%3Duefa%20european%20womens%20u-19%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:UEFAWU192311",
													"sports_event_mcp_id": "transmission:mcp:eventid:6094956",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Francia vs Islandia",
													"sports_home_team": "Francia",
													"sports_away_team": "Islandia",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "UEFAWU19",
													"sports_league_name": "UEFA European Womens U-19",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "368",
											"name": "Francia",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5c9cf5a75a1a73751b3c9/965d9f2e2b51ee83d34c2ad23f9ee570",
												"link": "https://images.vix.com/prd/team-logo/64b5c9cf5a75a1a73751b3c9/965d9f2e2b51ee83d34c2ad23f9ee570",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "503",
											"name": "Islandia",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/63f63c0894ee426e3da38e83/4c824cf1a99224ff4fa5a3b0e33eefc2",
												"link": "https://images.vix.com/prd/team-logo/63f63c0894ee426e3da38e83/4c824cf1a99224ff4fa5a3b0e33eefc2",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946?tr=w-1800,h-1020,:oi-/prd/team-logo/64b5c9cf5a75a1a73751b3c9/965d9f2e2b51ee83d34c2ad23f9ee570,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/63f63c0894ee426e3da38e83/4c824cf1a99224ff4fa5a3b0e33eefc2,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335735",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335735",
										"ui_content_title": "Talleres De Córdoba vs Gimnasia y Esgrima (LP)",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/6216678deb81d28d48c6d4e6/1e4a8ba29dcb5a4083365ada8617aed8",
										"link": "https://images.vix.com/prd/team-logo/6216678deb81d28d48c6d4e6/1e4a8ba29dcb5a4083365ada8617aed8",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62166559eb81d28edec6c425/fc13f99fb101aa5695f104985c780554",
										"link": "https://images.vix.com/prd/team-logo/62166559eb81d28edec6c425/fc13f99fb101aa5695f104985c780554",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335735",
									"sportsEvent": {
										"id": "transmission:matchid:2335735",
										"name": "Talleres De Córdoba vs Gimnasia y Esgrima (LP)",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstAD94dQ21aBZ8"
											},
											"kickoffDate": "2023-07-24T19:30:00.000Z",
											"scheduledStartTime": "2023-07-24T19:15:00.000Z",
											"scheduledEndTime": "2023-07-24T21:50:00.000Z",
											"streamId": "adstAD94dQ21aBZ8",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335735",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335735%26sports_event_mcp_id%3Dtransmissionmcpeventid6210364%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dtalleres%20de%20cordoba%20vs%20gimnasia%20y%20esgrima%20lp%26sports_home_team%3Dtalleres%20de%20cordoba%26sports_away_team%3Dgimnasia%20y%20esgrima%20lp%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335735",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210364",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Talleres De Córdoba vs Gimnasia y Esgrima (LP)",
													"sports_home_team": "Talleres De Córdoba",
													"sports_away_team": "Gimnasia y Esgrima (LP)",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "1071",
											"name": "Talleres De Córdoba",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/6216678deb81d28d48c6d4e6/1e4a8ba29dcb5a4083365ada8617aed8",
												"link": "https://images.vix.com/prd/team-logo/6216678deb81d28d48c6d4e6/1e4a8ba29dcb5a4083365ada8617aed8",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "1392",
											"name": "Gimnasia y Esgrima (LP)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62166559eb81d28edec6c425/fc13f99fb101aa5695f104985c780554",
												"link": "https://images.vix.com/prd/team-logo/62166559eb81d28edec6c425/fc13f99fb101aa5695f104985c780554",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/6216678deb81d28d48c6d4e6/1e4a8ba29dcb5a4083365ada8617aed8,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/62166559eb81d28edec6c425/fc13f99fb101aa5695f104985c780554,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335733",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335733",
										"ui_content_title": "Vélez Sarsfield vs Unión De Santa Fe",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62166818eb81d23ec1c6dcc0/12f6fa53de9762dd1ff81d8ece321543",
										"link": "https://images.vix.com/prd/team-logo/62166818eb81d23ec1c6dcc0/12f6fa53de9762dd1ff81d8ece321543",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621667f0eb81d26947c6d87b/3e307fd2b33b796afb6d2b782007059d",
										"link": "https://images.vix.com/prd/team-logo/621667f0eb81d26947c6d87b/3e307fd2b33b796afb6d2b782007059d",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335733",
									"sportsEvent": {
										"id": "transmission:matchid:2335733",
										"name": "Vélez Sarsfield vs Unión De Santa Fe",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstm0W8NxDVNp9E"
											},
											"kickoffDate": "2023-07-24T19:30:00.000Z",
											"scheduledStartTime": "2023-07-24T19:15:00.000Z",
											"scheduledEndTime": "2023-07-24T21:50:00.000Z",
											"streamId": "adstm0W8NxDVNp9E",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335733",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335733%26sports_event_mcp_id%3Dtransmissionmcpeventid6210209%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dvelez%20sarsfield%20vs%20union%20de%20santa%20fe%26sports_home_team%3Dvelez%20sarsfield%26sports_away_team%3Dunion%20de%20santa%20fe%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335733",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210209",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Vélez Sarsfield vs Unión De Santa Fe",
													"sports_home_team": "Vélez Sarsfield",
													"sports_away_team": "Unión De Santa Fe",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "570",
											"name": "Vélez Sarsfield",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62166818eb81d23ec1c6dcc0/12f6fa53de9762dd1ff81d8ece321543",
												"link": "https://images.vix.com/prd/team-logo/62166818eb81d23ec1c6dcc0/12f6fa53de9762dd1ff81d8ece321543",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "6374",
											"name": "Unión De Santa Fe",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621667f0eb81d26947c6d87b/3e307fd2b33b796afb6d2b782007059d",
												"link": "https://images.vix.com/prd/team-logo/621667f0eb81d26947c6d87b/3e307fd2b33b796afb6d2b782007059d",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/62166818eb81d23ec1c6dcc0/12f6fa53de9762dd1ff81d8ece321543,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/621667f0eb81d26947c6d87b/3e307fd2b33b796afb6d2b782007059d,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335731",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335731",
										"ui_content_title": "Banfield vs Godoy Cruz",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62166444eb81d28d34c6bce3/3ff8791f13da60cb699251df897118ba",
										"link": "https://images.vix.com/prd/team-logo/62166444eb81d28d34c6bce3/3ff8791f13da60cb699251df897118ba",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621665aaeb81d22b36c6c77f/480304deea7b01b6b5059107426727d4",
										"link": "https://images.vix.com/prd/team-logo/621665aaeb81d22b36c6c77f/480304deea7b01b6b5059107426727d4",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335731",
									"sportsEvent": {
										"id": "transmission:matchid:2335731",
										"name": "Banfield vs Godoy Cruz",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstxmQGd5ljq5vj"
											},
											"kickoffDate": "2023-07-24T21:30:00.000Z",
											"scheduledStartTime": "2023-07-24T21:15:00.000Z",
											"scheduledEndTime": "2023-07-24T23:50:00.000Z",
											"streamId": "adstxmQGd5ljq5vj",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335731",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335731%26sports_event_mcp_id%3Dtransmissionmcpeventid6210365%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dbanfield%20vs%20godoy%20cruz%26sports_home_team%3Dbanfield%26sports_away_team%3Dgodoy%20cruz%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335731",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210365",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Banfield vs Godoy Cruz",
													"sports_home_team": "Banfield",
													"sports_away_team": "Godoy Cruz",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "2451",
											"name": "Banfield",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62166444eb81d28d34c6bce3/3ff8791f13da60cb699251df897118ba",
												"link": "https://images.vix.com/prd/team-logo/62166444eb81d28d34c6bce3/3ff8791f13da60cb699251df897118ba",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "2834",
											"name": "Godoy Cruz",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621665aaeb81d22b36c6c77f/480304deea7b01b6b5059107426727d4",
												"link": "https://images.vix.com/prd/team-logo/621665aaeb81d22b36c6c77f/480304deea7b01b6b5059107426727d4",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/62166444eb81d28d34c6bce3/3ff8791f13da60cb699251df897118ba,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/621665aaeb81d22b36c6c77f/480304deea7b01b6b5059107426727d4,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2355575",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2355575",
										"ui_content_title": "Coritiba vs Fluminense",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
										"link": "https://images.vix.com/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
										"link": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
										"link": "https://images.vix.com/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/624daaa258227669adee1aed/c432c0d53d8ea1e99659cd9ea9727fa8",
										"link": "https://images.vix.com/prd/team-logo/624daaa258227669adee1aed/c432c0d53d8ea1e99659cd9ea9727fa8",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
										"link": "https://images.vix.com/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2355575",
									"sportsEvent": {
										"id": "transmission:matchid:2355575",
										"name": "Coritiba vs Fluminense",
										"badges": [],
										"tournament": {
											"id": "363",
											"name": "Brasileirão Serie A",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
												"link": "https://images.vix.com/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
												"link": "https://images.vix.com/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
												"link": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstAjPoNMA9NZvm"
											},
											"kickoffDate": "2023-07-24T22:00:00.000Z",
											"scheduledStartTime": "2023-07-24T21:45:00.000Z",
											"scheduledEndTime": "2023-07-25T00:20:00.000Z",
											"streamId": "adstAjPoNMA9NZvm",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2355575",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2355575%26sports_event_mcp_id%3Dtransmissionmcpeventid6158943%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dcoritiba%20vs%20fluminense%26sports_home_team%3Dcoritiba%26sports_away_team%3Dfluminense%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D363%26sports_league_name%3Dbrasileirao%20serie%20a%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2355575",
													"sports_event_mcp_id": "transmission:mcp:eventid:6158943",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Coritiba vs Fluminense",
													"sports_home_team": "Coritiba",
													"sports_away_team": "Fluminense",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "363",
													"sports_league_name": "Brasileirão Serie A",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "2477",
											"name": "Coritiba",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/624daaa258227669adee1aed/c432c0d53d8ea1e99659cd9ea9727fa8",
												"link": "https://images.vix.com/prd/team-logo/624daaa258227669adee1aed/c432c0d53d8ea1e99659cd9ea9727fa8",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "1734",
											"name": "Fluminense",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
												"link": "https://images.vix.com/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e?tr=w-1800,h-1020,:oi-/prd/team-logo/624daaa258227669adee1aed/c432c0d53d8ea1e99659cd9ea9727fa8,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335724",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335724",
										"ui_content_title": "Racing Club vs Central Córdoba",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621666c8eb81d291d1c6d10c/a8d47f599a4625ca0c51e5a4245d534d",
										"link": "https://images.vix.com/prd/team-logo/621666c8eb81d291d1c6d10c/a8d47f599a4625ca0c51e5a4245d534d",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621664a0eb81d21011c6bfcd/bbfa91f4aa0c24393fd2ba6bc1922544",
										"link": "https://images.vix.com/prd/team-logo/621664a0eb81d21011c6bfcd/bbfa91f4aa0c24393fd2ba6bc1922544",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335724",
									"sportsEvent": {
										"id": "transmission:matchid:2335724",
										"name": "Racing Club vs Central Córdoba",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstkZj0Nv4ZdzB6"
											},
											"kickoffDate": "2023-07-24T22:30:00.000Z",
											"scheduledStartTime": "2023-07-24T22:15:00.000Z",
											"scheduledEndTime": "2023-07-25T00:50:00.000Z",
											"streamId": "adstkZj0Nv4ZdzB6",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335724",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335724%26sports_event_mcp_id%3Dtransmissionmcpeventid6210366%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dracing%20club%20vs%20central%20cordoba%26sports_home_team%3Dracing%20club%26sports_away_team%3Dcentral%20cordoba%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335724",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210366",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Racing Club vs Central Córdoba",
													"sports_home_team": "Racing Club",
													"sports_away_team": "Central Córdoba",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "986",
											"name": "Racing Club",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621666c8eb81d291d1c6d10c/a8d47f599a4625ca0c51e5a4245d534d",
												"link": "https://images.vix.com/prd/team-logo/621666c8eb81d291d1c6d10c/a8d47f599a4625ca0c51e5a4245d534d",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "10752",
											"name": "Central Córdoba",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621664a0eb81d21011c6bfcd/bbfa91f4aa0c24393fd2ba6bc1922544",
												"link": "https://images.vix.com/prd/team-logo/621664a0eb81d21011c6bfcd/bbfa91f4aa0c24393fd2ba6bc1922544",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/621666c8eb81d291d1c6d10c/a8d47f599a4625ca0c51e5a4245d534d,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/621664a0eb81d21011c6bfcd/bbfa91f4aa0c24393fd2ba6bc1922544,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:MXF01A23US08",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:MXF01A23US08",
										"ui_content_title": "Necaxa (f) vs Tijuana (f)",
										"ui_content_type": "SportsGame",
										"ui_content_group": "promo"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
										"link": "https://images.vix.com/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
										"link": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
										"link": "https://images.vix.com/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64ac7376f611ce1b829f1bf7/e798d422bae503bdc5104d5779e1771c",
										"link": "https://images.vix.com/prd/team-logo/64ac7376f611ce1b829f1bf7/e798d422bae503bdc5104d5779e1771c",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b024c648d23ae0dd4a0b83/52cecce96a1dc1ec203c005b78379eac",
										"link": "https://images.vix.com/prd/team-logo/64b024c648d23ae0dd4a0b83/52cecce96a1dc1ec203c005b78379eac",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:MXF01A23US08",
									"sportsEvent": {
										"id": "transmission:matchid:MXF01A23US08",
										"name": "Necaxa (f) vs Tijuana (f)",
										"badges": ["FREE"],
										"tournament": {
											"id": "MXF01",
											"name": "Liga MX Femenil (Apertura)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
												"link": "https://images.vix.com/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
												"link": "https://images.vix.com/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
												"link": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "BEFORE_START_DATE"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst0J4VNVWKq2zX"
											},
											"kickoffDate": "2023-07-24T23:00:00.000Z",
											"scheduledStartTime": "2023-07-24T22:30:00.000Z",
											"scheduledEndTime": "2023-07-25T01:20:00.000Z",
											"streamId": "adst0J4VNVWKq2zX",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-MXF01A23US08",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidmxf01a23us08%26sports_event_mcp_id%3Dtransmissionmcpeventid6186717%26video_type%3Dliveevent%26content_group%3Dpromo%26sports_pckg%3Dligamxfemenil%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dnecaxa%20f%20vs%20tijuana%20f%26sports_home_team%3Dnecaxa%20f%26sports_away_team%3Dtijuana%20f%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Dmxf01%26sports_league_name%3Dliga%20mx%20femenil%20apertura%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:MXF01A23US08",
													"sports_event_mcp_id": "transmission:mcp:eventid:6186717",
													"video_type": "liveevent",
													"content_group": "promo",
													"sports_pckg": "ligamxfemenil",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Necaxa (f) vs Tijuana (f)",
													"sports_home_team": "Necaxa (f)",
													"sports_away_team": "Tijuana (f)",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "MXF01",
													"sports_league_name": "Liga MX Femenil (Apertura)",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "F1174",
											"name": "Necaxa (f)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64ac7376f611ce1b829f1bf7/e798d422bae503bdc5104d5779e1771c",
												"link": "https://images.vix.com/prd/team-logo/64ac7376f611ce1b829f1bf7/e798d422bae503bdc5104d5779e1771c",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "F4690",
											"name": "Tijuana (f)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b024c648d23ae0dd4a0b83/52cecce96a1dc1ec203c005b78379eac",
												"link": "https://images.vix.com/prd/team-logo/64b024c648d23ae0dd4a0b83/52cecce96a1dc1ec203c005b78379eac",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069?tr=w-1800,h-1020,:oi-/prd/team-logo/64ac7376f611ce1b829f1bf7/e798d422bae503bdc5104d5779e1771c,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64b024c648d23ae0dd4a0b83/52cecce96a1dc1ec203c005b78379eac,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335736",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335736",
										"ui_content_title": "Boca Juniors vs Newell´s Old Boys",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62166481eb81d23ae9c6be43/097deb0649603bf29cdcd490d73ba31e",
										"link": "https://images.vix.com/prd/team-logo/62166481eb81d23ae9c6be43/097deb0649603bf29cdcd490d73ba31e",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/6216666beb81d280c5c6ce03/e5b908dd0329c5ed1be6527d96444209",
										"link": "https://images.vix.com/prd/team-logo/6216666beb81d280c5c6ce03/e5b908dd0329c5ed1be6527d96444209",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335736",
									"sportsEvent": {
										"id": "transmission:matchid:2335736",
										"name": "Boca Juniors vs Newell´s Old Boys",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst60j3qrMbNXpm"
											},
											"kickoffDate": "2023-07-24T23:45:00.000Z",
											"scheduledStartTime": "2023-07-24T23:30:00.000Z",
											"scheduledEndTime": "2023-07-25T02:05:00.000Z",
											"streamId": "adst60j3qrMbNXpm",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335736",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335736%26sports_event_mcp_id%3Dtransmissionmcpeventid6210834%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dboca%20juniors%20vs%20newells%20old%20boys%26sports_home_team%3Dboca%20juniors%26sports_away_team%3Dnewells%20old%20boys%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335736",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210834",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Boca Juniors vs Newell´s Old Boys",
													"sports_home_team": "Boca Juniors",
													"sports_away_team": "Newell´s Old Boys",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "540",
											"name": "Boca Juniors",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62166481eb81d23ae9c6be43/097deb0649603bf29cdcd490d73ba31e",
												"link": "https://images.vix.com/prd/team-logo/62166481eb81d23ae9c6be43/097deb0649603bf29cdcd490d73ba31e",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "1095",
											"name": "Newell´s Old Boys",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/6216666beb81d280c5c6ce03/e5b908dd0329c5ed1be6527d96444209",
												"link": "https://images.vix.com/prd/team-logo/6216666beb81d280c5c6ce03/e5b908dd0329c5ed1be6527d96444209",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/62166481eb81d23ae9c6be43/097deb0649603bf29cdcd490d73ba31e,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/6216666beb81d280c5c6ce03/e5b908dd0329c5ed1be6527d96444209,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2348883",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2348883",
										"ui_content_title": "Jaguares de Córdoba vs Boyacá Chicó",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/63d19736e073c006740d0bbe/472674e2ced419ba242e9889949750fc",
										"link": "https://images.vix.com/prd/league/logo/63d19736e073c006740d0bbe/472674e2ced419ba242e9889949750fc",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/6216607ceb81d251f1c68ec3/9b60180611a71d3c77df249821ee382f",
										"link": "https://images.vix.com/prd/league/card/6216607ceb81d251f1c68ec3/9b60180611a71d3c77df249821ee382f",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/62165b4deb81d20499c659ff/0f3311ea42e09099eef314686163fb03",
										"link": "https://images.vix.com/prd/league/splash/62165b4deb81d20499c659ff/0f3311ea42e09099eef314686163fb03",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62165d75eb81d2cec1c66ca9/7f27efcf2823eb68618ea873ff8492af",
										"link": "https://images.vix.com/prd/team-logo/62165d75eb81d2cec1c66ca9/7f27efcf2823eb68618ea873ff8492af",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/6217aab11696600bae96249d/e0280874686810bcae0fc3415fa71e30",
										"link": "https://images.vix.com/prd/team-logo/6217aab11696600bae96249d/e0280874686810bcae0fc3415fa71e30",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2348883",
									"sportsEvent": {
										"id": "transmission:matchid:2348883",
										"name": "Jaguares de Córdoba vs Boyacá Chicó",
										"badges": [],
										"tournament": {
											"id": "371",
											"name": "Colombia Primera A",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/63d19736e073c006740d0bbe/472674e2ced419ba242e9889949750fc",
												"link": "https://images.vix.com/prd/league/logo/63d19736e073c006740d0bbe/472674e2ced419ba242e9889949750fc",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/62165b4deb81d20499c659ff/0f3311ea42e09099eef314686163fb03",
												"link": "https://images.vix.com/prd/league/splash/62165b4deb81d20499c659ff/0f3311ea42e09099eef314686163fb03",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/6216607ceb81d251f1c68ec3/9b60180611a71d3c77df249821ee382f",
												"link": "https://images.vix.com/prd/league/card/6216607ceb81d251f1c68ec3/9b60180611a71d3c77df249821ee382f",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstYRQVa8POaw4n"
											},
											"kickoffDate": "2023-07-25T00:00:00.000Z",
											"scheduledStartTime": "2023-07-24T23:45:00.000Z",
											"scheduledEndTime": "2023-07-25T02:20:00.000Z",
											"streamId": "adstYRQVa8POaw4n",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2348883",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2348883%26sports_event_mcp_id%3Dtransmissionmcpeventid6082984%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Djaguares%20de%20cordoba%20vs%20boyaca%20chico%26sports_home_team%3Djaguares%20de%20cordoba%26sports_away_team%3Dboyaca%20chico%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D371%26sports_league_name%3Dcolombia%20primera%20a%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2348883",
													"sports_event_mcp_id": "transmission:mcp:eventid:6082984",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Jaguares de Córdoba vs Boyacá Chicó",
													"sports_home_team": "Jaguares de Córdoba",
													"sports_away_team": "Boyacá Chicó",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "371",
													"sports_league_name": "Colombia Primera A",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "7683",
											"name": "Jaguares de Córdoba",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62165d75eb81d2cec1c66ca9/7f27efcf2823eb68618ea873ff8492af",
												"link": "https://images.vix.com/prd/team-logo/62165d75eb81d2cec1c66ca9/7f27efcf2823eb68618ea873ff8492af",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "2671",
											"name": "Boyacá Chicó",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/6217aab11696600bae96249d/e0280874686810bcae0fc3415fa71e30",
												"link": "https://images.vix.com/prd/team-logo/6217aab11696600bae96249d/e0280874686810bcae0fc3415fa71e30",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/6216607ceb81d251f1c68ec3/9b60180611a71d3c77df249821ee382f?tr=w-1800,h-1020,:oi-/prd/team-logo/62165d75eb81d2cec1c66ca9/7f27efcf2823eb68618ea873ff8492af,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/6217aab11696600bae96249d/e0280874686810bcae0fc3415fa71e30,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2383653",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2383653",
										"ui_content_title": "Atlante vs Universidad de Guadalajara",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
										"link": "https://images.vix.com/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
										"link": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
										"link": "https://images.vix.com/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5bda3ba8546dd8a0c558b/ad302a1039cf39d1b920e9a85f3ec8e3",
										"link": "https://images.vix.com/prd/team-logo/64b5bda3ba8546dd8a0c558b/ad302a1039cf39d1b920e9a85f3ec8e3",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5bfd932d703b8f3224420/54e9994b95579ddc4eb04f95aeaf895d",
										"link": "https://images.vix.com/prd/team-logo/64b5bfd932d703b8f3224420/54e9994b95579ddc4eb04f95aeaf895d",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2383653",
									"sportsEvent": {
										"id": "transmission:matchid:2383653",
										"name": "Atlante vs Universidad de Guadalajara",
										"badges": [],
										"tournament": {
											"id": "690",
											"name": "Liga de Expansión MX",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
												"link": "https://images.vix.com/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
												"link": "https://images.vix.com/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
												"link": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstAjPoNMA9NZvm"
											},
											"kickoffDate": "2023-07-25T01:05:00.000Z",
											"scheduledStartTime": "2023-07-25T00:50:00.000Z",
											"scheduledEndTime": "2023-07-25T03:25:00.000Z",
											"streamId": "adstAjPoNMA9NZvm",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2383653",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2383653%26sports_event_mcp_id%3Dtransmissionmcpeventid6186748%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Datlante%20vs%20universidad%20de%20guadalajara%26sports_home_team%3Datlante%26sports_away_team%3Duniversidad%20de%20guadalajara%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D690%26sports_league_name%3Dliga%20de%20expansion%20mx%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2383653",
													"sports_event_mcp_id": "transmission:mcp:eventid:6186748",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Atlante vs Universidad de Guadalajara",
													"sports_home_team": "Atlante",
													"sports_away_team": "Universidad de Guadalajara",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "690",
													"sports_league_name": "Liga de Expansión MX",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "1291",
											"name": "Atlante",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5bda3ba8546dd8a0c558b/ad302a1039cf39d1b920e9a85f3ec8e3",
												"link": "https://images.vix.com/prd/team-logo/64b5bda3ba8546dd8a0c558b/ad302a1039cf39d1b920e9a85f3ec8e3",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "7580",
											"name": "Universidad de Guadalajara",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5bfd932d703b8f3224420/54e9994b95579ddc4eb04f95aeaf895d",
												"link": "https://images.vix.com/prd/team-logo/64b5bfd932d703b8f3224420/54e9994b95579ddc4eb04f95aeaf895d",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c?tr=w-1800,h-1020,:oi-/prd/team-logo/64b5bda3ba8546dd8a0c558b/ad302a1039cf39d1b920e9a85f3ec8e3,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64b5bfd932d703b8f3224420/54e9994b95579ddc4eb04f95aeaf895d,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:PBR2301",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:PBR2301",
										"ui_content_title": "Team Series 2023 Cheyenne Day 1",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
										"link": "https://images.vix.com/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
										"link": "https://images.vix.com/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
										"link": "https://images.vix.com/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:PBR2301",
									"sportsEvent": {
										"id": "transmission:matchid:PBR2301",
										"name": "Team Series 2023 Cheyenne Day 1",
										"badges": [],
										"tournament": {
											"id": "PBR",
											"name": "PBR Teams",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
												"link": "https://images.vix.com/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
												"link": "https://images.vix.com/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
												"link": "https://images.vix.com/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstxV26qgmQaG5Z"
											},
											"kickoffDate": "2023-07-25T02:00:00.000Z",
											"scheduledStartTime": "2023-07-25T01:45:00.000Z",
											"scheduledEndTime": "2023-07-25T04:50:00.000Z",
											"streamId": "adstxV26qgmQaG5Z",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-PBR2301",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidpbr2301%26sports_event_mcp_id%3Dtransmissionmcpeventid6262742%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dteam series 2023%20cheyenne%20day%201%26sports_home_team%3Dteam series 2023%20cheyenne%20day%201%26sports_away_team%3D%26sports_id%3Dsoccer%26sports_title%3Dlive%20events%26sports_league_id%3Dpbr%26sports_league_name%3Dpbr%20teams%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:PBR2301",
													"sports_event_mcp_id": "transmission:mcp:eventid:6262742",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Team Series 2023 Cheyenne Day 1",
													"sports_home_team": "Team Series 2023 Cheyenne Day 1",
													"sports_away_team": ".",
													"sports_id": "SOCCER",
													"sports_title": "Live Events",
													"sports_league_id": "PBR",
													"sports_league_name": "PBR Teams",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "PBR2301",
											"name": "Team Series 2023 Cheyenne Day 1",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "PBRG",
											"name": ".",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122?tr=w-1800,h-1020,:oi-/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335729",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335729",
										"ui_content_title": "Barracas Central vs Arsenal de Sarandi",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621681e4eb81d2b45bc7ea01/788b5b2cbdbf19c0c5c9a36a4d503c17",
										"link": "https://images.vix.com/prd/team-logo/621681e4eb81d2b45bc7ea01/788b5b2cbdbf19c0c5c9a36a4d503c17",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621661efeb81d22e93c69f9b/2fb10d4e92854f12fc93841af7e53678",
										"link": "https://images.vix.com/prd/team-logo/621661efeb81d22e93c69f9b/2fb10d4e92854f12fc93841af7e53678",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335729",
									"sportsEvent": {
										"id": "transmission:matchid:2335729",
										"name": "Barracas Central vs Arsenal de Sarandi",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst60j3qrMbNXpm"
											},
											"kickoffDate": "2023-07-25T18:30:00.000Z",
											"scheduledStartTime": "2023-07-25T18:15:00.000Z",
											"scheduledEndTime": "2023-07-25T20:50:00.000Z",
											"streamId": "adst60j3qrMbNXpm",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335729",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335729%26sports_event_mcp_id%3Dtransmissionmcpeventid6210837%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dbarracas%20central%20vs%20arsenal%20de%20sarandi%26sports_home_team%3Dbarracas%20central%26sports_away_team%3Darsenal%20de%20sarandi%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335729",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210837",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Barracas Central vs Arsenal de Sarandi",
													"sports_home_team": "Barracas Central",
													"sports_away_team": "Arsenal de Sarandi",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "9280",
											"name": "Barracas Central",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621681e4eb81d2b45bc7ea01/788b5b2cbdbf19c0c5c9a36a4d503c17",
												"link": "https://images.vix.com/prd/team-logo/621681e4eb81d2b45bc7ea01/788b5b2cbdbf19c0c5c9a36a4d503c17",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "2577",
											"name": "Arsenal de Sarandi",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621661efeb81d22e93c69f9b/2fb10d4e92854f12fc93841af7e53678",
												"link": "https://images.vix.com/prd/team-logo/621661efeb81d22e93c69f9b/2fb10d4e92854f12fc93841af7e53678",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/621681e4eb81d2b45bc7ea01/788b5b2cbdbf19c0c5c9a36a4d503c17,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/621661efeb81d22e93c69f9b/2fb10d4e92854f12fc93841af7e53678,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335728",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335728",
										"ui_content_title": "Colón Santa Fe vs Tigre",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621664c4eb81d26c00c6c0f7/bad4248c76f5f26ee83d52fcf069c51f",
										"link": "https://images.vix.com/prd/team-logo/621664c4eb81d26c00c6c0f7/bad4248c76f5f26ee83d52fcf069c51f",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/61f2166b63482ef3cf2d0c9a/6927410602cbc2f6cefcce226c557263",
										"link": "https://images.vix.com/prd/team-logo/61f2166b63482ef3cf2d0c9a/6927410602cbc2f6cefcce226c557263",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335728",
									"sportsEvent": {
										"id": "transmission:matchid:2335728",
										"name": "Colón Santa Fe vs Tigre",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstm0W8NxDVNp9E"
											},
											"kickoffDate": "2023-07-25T21:00:00.000Z",
											"scheduledStartTime": "2023-07-25T20:45:00.000Z",
											"scheduledEndTime": "2023-07-25T23:20:00.000Z",
											"streamId": "adstm0W8NxDVNp9E",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335728",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335728%26sports_event_mcp_id%3Dtransmissionmcpeventid6210845%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dcolon%20santa%20fe%20vs%20tigre%26sports_home_team%3Dcolon%20santa%20fe%26sports_away_team%3Dtigre%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335728",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210845",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Colón Santa Fe vs Tigre",
													"sports_home_team": "Colón Santa Fe",
													"sports_away_team": "Tigre",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "1027",
											"name": "Colón Santa Fe",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621664c4eb81d26c00c6c0f7/bad4248c76f5f26ee83d52fcf069c51f",
												"link": "https://images.vix.com/prd/team-logo/621664c4eb81d26c00c6c0f7/bad4248c76f5f26ee83d52fcf069c51f",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "2580",
											"name": "Tigre",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/61f2166b63482ef3cf2d0c9a/6927410602cbc2f6cefcce226c557263",
												"link": "https://images.vix.com/prd/team-logo/61f2166b63482ef3cf2d0c9a/6927410602cbc2f6cefcce226c557263",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/621664c4eb81d26c00c6c0f7/bad4248c76f5f26ee83d52fcf069c51f,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/61f2166b63482ef3cf2d0c9a/6927410602cbc2f6cefcce226c557263,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2335730",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2335730",
										"ui_content_title": "Instituto AC Córdoba vs Lanús",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/63bc3471475a8dfab32d4219/d7930fea49896cc1882b49e8ebc9dd3f",
										"link": "https://images.vix.com/prd/team-logo/63bc3471475a8dfab32d4219/d7930fea49896cc1882b49e8ebc9dd3f",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62166636eb81d22f2cc6cd5a/ca8a84d3afa312a166a0177831e43f53",
										"link": "https://images.vix.com/prd/team-logo/62166636eb81d22f2cc6cd5a/ca8a84d3afa312a166a0177831e43f53",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2335730",
									"sportsEvent": {
										"id": "transmission:matchid:2335730",
										"name": "Instituto AC Córdoba vs Lanús",
										"badges": [],
										"tournament": {
											"id": "724",
											"name": "Argentina Primera",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"link": "https://images.vix.com/prd/league/logo/62166f8aeb81d20afdc72541/cd633ddc688e0f217e2d9699e1bafb2c",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"link": "https://images.vix.com/prd/league/splash/6216608deb81d20e92c68f57/64037d5d6e4cd0fe7df27acc97fd737b",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"link": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstAD94dQ21aBZ8"
											},
											"kickoffDate": "2023-07-25T23:30:00.000Z",
											"scheduledStartTime": "2023-07-25T23:15:00.000Z",
											"scheduledEndTime": "2023-07-26T01:50:00.000Z",
											"streamId": "adstAD94dQ21aBZ8",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2335730",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2335730%26sports_event_mcp_id%3Dtransmissionmcpeventid6210838%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dinstituto%20ac%20cordoba%20vs%20lanus%26sports_home_team%3Dinstituto%20ac%20cordoba%26sports_away_team%3Dlanus%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D724%26sports_league_name%3Dargentina%20primera%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2335730",
													"sports_event_mcp_id": "transmission:mcp:eventid:6210838",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Instituto AC Córdoba vs Lanús",
													"sports_home_team": "Instituto AC Córdoba",
													"sports_away_team": "Lanús",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "724",
													"sports_league_name": "Argentina Primera",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "ARG2302",
											"name": "Instituto AC Córdoba",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/63bc3471475a8dfab32d4219/d7930fea49896cc1882b49e8ebc9dd3f",
												"link": "https://images.vix.com/prd/team-logo/63bc3471475a8dfab32d4219/d7930fea49896cc1882b49e8ebc9dd3f",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "2473",
											"name": "Lanús",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62166636eb81d22f2cc6cd5a/ca8a84d3afa312a166a0177831e43f53",
												"link": "https://images.vix.com/prd/team-logo/62166636eb81d22f2cc6cd5a/ca8a84d3afa312a166a0177831e43f53",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/62166915eb81d283bdc6e5ac/a72bb3b9a46f4ba6bb708c0ba4ddf1bf?tr=w-1800,h-1020,:oi-/prd/team-logo/63bc3471475a8dfab32d4219/d7930fea49896cc1882b49e8ebc9dd3f,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/62166636eb81d22f2cc6cd5a/ca8a84d3afa312a166a0177831e43f53,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:LMB45132",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:LMB45132",
										"ui_content_title": "LMB Grand Slam: Todos los partidos en un solo lugar vs .",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64469c2259c9cf9adf2a1678/8888a9f8304db75669077a4bb05670e8",
										"link": "https://images.vix.com/prd/team-logo/64469c2259c9cf9adf2a1678/8888a9f8304db75669077a4bb05670e8",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:LMB45132",
									"sportsEvent": {
										"id": "transmission:matchid:LMB45132",
										"name": "LMB Grand Slam: Todos los partidos en un solo lugar vs .",
										"badges": [],
										"tournament": {
											"id": "LMB",
											"name": "Liga Mexicana de Beisbol",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstxV26qgmQaG5Z"
											},
											"kickoffDate": "2023-07-26T01:30:00.000Z",
											"scheduledStartTime": "2023-07-26T01:15:00.000Z",
											"scheduledEndTime": "2023-07-26T05:50:00.000Z",
											"streamId": "adstxV26qgmQaG5Z",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-LMB45132",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidlmb45132%26sports_event_mcp_id%3Dtransmissionmcpeventid6188631%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dlmb%20grand%20slam%20todos%20los%20partidos%20en%20un%20solo%20lugar%20vs%20%26sports_home_team%3Dlmb%20grand%20slam%20todos%20los%20partidos%20en%20un%20solo%20lugar%26sports_away_team%3D%26sports_id%3Dsoccer%26sports_title%3Dbaseball%26sports_league_id%3Dlmb%26sports_league_name%3Dliga%20mexicana%20de%20beisbol%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:LMB45132",
													"sports_event_mcp_id": "transmission:mcp:eventid:6188631",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "LMB Grand Slam: Todos los partidos en un solo lugar vs .",
													"sports_home_team": "LMB Grand Slam: Todos los partidos en un solo lugar",
													"sports_away_team": ".",
													"sports_id": "SOCCER",
													"sports_title": "Baseball",
													"sports_league_id": "LMB",
													"sports_league_name": "Liga Mexicana de Beisbol",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "LMB20",
											"name": "LMB Grand Slam: Todos los partidos en un solo lugar",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64469c2259c9cf9adf2a1678/8888a9f8304db75669077a4bb05670e8",
												"link": "https://images.vix.com/prd/team-logo/64469c2259c9cf9adf2a1678/8888a9f8304db75669077a4bb05670e8",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "B123409",
											"name": ".",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d?tr=w-1800,h-1020,:oi-/prd/team-logo/64469c2259c9cf9adf2a1678/8888a9f8304db75669077a4bb05670e8,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:PBR2302",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:PBR2302",
										"ui_content_title": "Team Series 2023 Cheyenne Day 2",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
										"link": "https://images.vix.com/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
										"link": "https://images.vix.com/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
										"link": "https://images.vix.com/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:PBR2302",
									"sportsEvent": {
										"id": "transmission:matchid:PBR2302",
										"name": "Team Series 2023 Cheyenne Day 2",
										"badges": [],
										"tournament": {
											"id": "PBR",
											"name": "PBR Teams",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
												"link": "https://images.vix.com/prd/league/logo/64b97c04a5725df531cddc75/c16de301694497a450aa8fe45cb7f055",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
												"link": "https://images.vix.com/prd/league/splash/64b9b90ee64b0ccc79e5a0a8/8620afa1fae9ffdefb835a9d21d06122",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
												"link": "https://images.vix.com/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstOZ5RqeVVd9EG"
											},
											"kickoffDate": "2023-07-26T02:00:00.000Z",
											"scheduledStartTime": "2023-07-26T02:00:00.000Z",
											"scheduledEndTime": "2023-07-26T04:50:00.000Z",
											"streamId": "adstOZ5RqeVVd9EG",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-PBR2302",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidpbr2302%26sports_event_mcp_id%3Dtransmissionmcpeventid6262743%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dteam series 2023%20cheyenne%20day%202%26sports_home_team%3Dteam series 2023%20cheyenne%20day%202%26sports_away_team%3D%26sports_id%3Dsoccer%26sports_title%3Dlive%20events%26sports_league_id%3Dpbr%26sports_league_name%3Dpbr%20teams%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:PBR2302",
													"sports_event_mcp_id": "transmission:mcp:eventid:6262743",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Team Series 2023 Cheyenne Day 2",
													"sports_home_team": "Team Series 2023 Cheyenne Day 2",
													"sports_away_team": ".",
													"sports_id": "SOCCER",
													"sports_title": "Live Events",
													"sports_league_id": "PBR",
													"sports_league_name": "PBR Teams",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "PBR2302",
											"name": "Team Series 2023 Cheyenne Day 2",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "PBRG",
											"name": ".",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"link": "https://images.vix.com/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64b9b8fcea1be3c16f677d3e/8620afa1fae9ffdefb835a9d21d06122?tr=w-1800,h-1020,:oi-/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/624379279f0805422209a046/4bd955111d972403cadae9006d8efa25,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:LMB45133",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:LMB45133",
										"ui_content_title": "Tigres de Quintana Roo vs Saraperos de Saltillo",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62503a87b0fd2b99f9e9aa7c/ef13585012ef45a74feb16954373a26b",
										"link": "https://images.vix.com/prd/team-logo/62503a87b0fd2b99f9e9aa7c/ef13585012ef45a74feb16954373a26b",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62503a46ad46cb068ba5b899/d0bad4f6947af6a8a88e84358d20ecb3",
										"link": "https://images.vix.com/prd/team-logo/62503a46ad46cb068ba5b899/d0bad4f6947af6a8a88e84358d20ecb3",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:LMB45133",
									"sportsEvent": {
										"id": "transmission:matchid:LMB45133",
										"name": "Tigres de Quintana Roo vs Saraperos de Saltillo",
										"badges": [],
										"tournament": {
											"id": "LMB",
											"name": "Liga Mexicana de Beisbol",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstxV26qgmQaG5Z"
											},
											"kickoffDate": "2023-07-27T01:30:00.000Z",
											"scheduledStartTime": "2023-07-27T01:15:00.000Z",
											"scheduledEndTime": "2023-07-27T05:50:00.000Z",
											"streamId": "adstxV26qgmQaG5Z",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-LMB45133",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidlmb45133%26sports_event_mcp_id%3Dtransmissionmcpeventid6191054%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dtigres%20de%20quintana%20roo%20vs%20saraperos%20de%20saltillo%26sports_home_team%3Dtigres%20de%20quintana%20roo%26sports_away_team%3Dsaraperos%20de%20saltillo%26sports_id%3Dsoccer%26sports_title%3Dbaseball%26sports_league_id%3Dlmb%26sports_league_name%3Dliga%20mexicana%20de%20beisbol%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:LMB45133",
													"sports_event_mcp_id": "transmission:mcp:eventid:6191054",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Tigres de Quintana Roo vs Saraperos de Saltillo",
													"sports_home_team": "Tigres de Quintana Roo",
													"sports_away_team": "Saraperos de Saltillo",
													"sports_id": "SOCCER",
													"sports_title": "Baseball",
													"sports_league_id": "LMB",
													"sports_league_name": "Liga Mexicana de Beisbol",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "LMB18",
											"name": "Tigres de Quintana Roo",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62503a87b0fd2b99f9e9aa7c/ef13585012ef45a74feb16954373a26b",
												"link": "https://images.vix.com/prd/team-logo/62503a87b0fd2b99f9e9aa7c/ef13585012ef45a74feb16954373a26b",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "LMB06",
											"name": "Saraperos de Saltillo",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62503a46ad46cb068ba5b899/d0bad4f6947af6a8a88e84358d20ecb3",
												"link": "https://images.vix.com/prd/team-logo/62503a46ad46cb068ba5b899/d0bad4f6947af6a8a88e84358d20ecb3",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d?tr=w-1800,h-1020,:oi-/prd/team-logo/62503a87b0fd2b99f9e9aa7c/ef13585012ef45a74feb16954373a26b,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/62503a46ad46cb068ba5b899/d0bad4f6947af6a8a88e84358d20ecb3,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2383654",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2383654",
										"ui_content_title": "La Paz vs Celaya",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
										"link": "https://images.vix.com/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
										"link": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
										"link": "https://images.vix.com/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5bebfab503b5c1ce04fac/d59f094f76aba3733a9a7afea63f51ae",
										"link": "https://images.vix.com/prd/team-logo/64b5bebfab503b5c1ce04fac/d59f094f76aba3733a9a7afea63f51ae",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5be68c2fbf15a3a053490/fb9b49e6a9104bc0b949a7e12ffdfd15",
										"link": "https://images.vix.com/prd/team-logo/64b5be68c2fbf15a3a053490/fb9b49e6a9104bc0b949a7e12ffdfd15",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2383654",
									"sportsEvent": {
										"id": "transmission:matchid:2383654",
										"name": "La Paz vs Celaya",
										"badges": [],
										"tournament": {
											"id": "690",
											"name": "Liga de Expansión MX",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
												"link": "https://images.vix.com/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
												"link": "https://images.vix.com/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
												"link": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstYRQVa8POaw4n"
											},
											"kickoffDate": "2023-07-27T03:05:00.000Z",
											"scheduledStartTime": "2023-07-27T02:50:00.000Z",
											"scheduledEndTime": "2023-07-27T05:25:00.000Z",
											"streamId": "adstYRQVa8POaw4n",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2383654",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2383654%26sports_event_mcp_id%3Dtransmissionmcpeventid6186662%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dla%20paz%20vs%20celaya%26sports_home_team%3Dla%20paz%26sports_away_team%3Dcelaya%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D690%26sports_league_name%3Dliga%20de%20expansion%20mx%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2383654",
													"sports_event_mcp_id": "transmission:mcp:eventid:6186662",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "La Paz vs Celaya",
													"sports_home_team": "La Paz",
													"sports_away_team": "Celaya",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "690",
													"sports_league_name": "Liga de Expansión MX",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "EX001",
											"name": "La Paz",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5bebfab503b5c1ce04fac/d59f094f76aba3733a9a7afea63f51ae",
												"link": "https://images.vix.com/prd/team-logo/64b5bebfab503b5c1ce04fac/d59f094f76aba3733a9a7afea63f51ae",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "6668",
											"name": "Celaya",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5be68c2fbf15a3a053490/fb9b49e6a9104bc0b949a7e12ffdfd15",
												"link": "https://images.vix.com/prd/team-logo/64b5be68c2fbf15a3a053490/fb9b49e6a9104bc0b949a7e12ffdfd15",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c?tr=w-1800,h-1020,:oi-/prd/team-logo/64b5bebfab503b5c1ce04fac/d59f094f76aba3733a9a7afea63f51ae,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64b5be68c2fbf15a3a053490/fb9b49e6a9104bc0b949a7e12ffdfd15,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:UEFAWU192313",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:UEFAWU192313",
										"ui_content_title": "TBD HOME vs TBD AWAY",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:UEFAWU192313",
									"sportsEvent": {
										"id": "transmission:matchid:UEFAWU192313",
										"name": "TBD HOME vs TBD AWAY",
										"badges": [],
										"tournament": {
											"id": "UEFAWU19",
											"name": "UEFA European Womens U-19",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstYRQVa8POaw4n"
											},
											"kickoffDate": "2023-07-27T15:30:00.000Z",
											"scheduledStartTime": "2023-07-27T15:15:00.000Z",
											"scheduledEndTime": "2023-07-27T17:50:00.000Z",
											"streamId": "adstYRQVa8POaw4n",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-UEFAWU192313",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchiduefawu192313%26sports_event_mcp_id%3Dtransmissionmcpeventid6094959%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dtbd%20home%20vs%20tbd%20away%26sports_home_team%3Dtbd%20home%26sports_away_team%3Dtbd%20away%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Duefawu19%26sports_league_name%3Duefa%20european%20womens%20u-19%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:UEFAWU192313",
													"sports_event_mcp_id": "transmission:mcp:eventid:6094959",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "TBD HOME vs TBD AWAY",
													"sports_home_team": "TBD HOME",
													"sports_away_team": "TBD AWAY",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "UEFAWU19",
													"sports_league_name": "UEFA European Womens U-19",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "13558",
											"name": "TBD HOME",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "13559",
											"name": "TBD AWAY",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946?tr=w-1800,h-1020,:oi-/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:UEFAWU192314",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:UEFAWU192314",
										"ui_content_title": "TBD HOME vs TBD AWAY",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:UEFAWU192314",
									"sportsEvent": {
										"id": "transmission:matchid:UEFAWU192314",
										"name": "TBD HOME vs TBD AWAY",
										"badges": [],
										"tournament": {
											"id": "UEFAWU19",
											"name": "UEFA European Womens U-19",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/tournament/default-logo/61ba4841ddc8854037922e07/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-splashImage/61ba480fddc8857209922bd5/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"link": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstAjPoNMA9NZvm"
											},
											"kickoffDate": "2023-07-27T18:30:00.000Z",
											"scheduledStartTime": "2023-07-27T18:15:00.000Z",
											"scheduledEndTime": "2023-07-27T20:50:00.000Z",
											"streamId": "adstAjPoNMA9NZvm",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-UEFAWU192314",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchiduefawu192314%26sports_event_mcp_id%3Dtransmissionmcpeventid6094960%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dtbd%20home%20vs%20tbd%20away%26sports_home_team%3Dtbd%20home%26sports_away_team%3Dtbd%20away%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Duefawu19%26sports_league_name%3Duefa%20european%20womens%20u-19%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:UEFAWU192314",
													"sports_event_mcp_id": "transmission:mcp:eventid:6094960",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "TBD HOME vs TBD AWAY",
													"sports_home_team": "TBD HOME",
													"sports_away_team": "TBD AWAY",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "UEFAWU19",
													"sports_league_name": "UEFA European Womens U-19",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "13558",
											"name": "TBD HOME",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "13559",
											"name": "TBD AWAY",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"link": "https://images.vix.com/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/tournament/default-bgImage/61ba482bddc885036d922d57/9bb138184c5277d8c9b88ea892f83946?tr=w-1800,h-1020,:oi-/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team/default-logo/61ba47e7ddc885e30192289a/b60386086aaca0ff7b614b4ac25bd673,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:LMB45134",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:LMB45134",
										"ui_content_title": "Olmecas de Tabasco vs Algodoneros Unión Laguna",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/625039fa34a8f6da1dd140b9/6c058d149c845f496d419647ecc676b0",
										"link": "https://images.vix.com/prd/team-logo/625039fa34a8f6da1dd140b9/6c058d149c845f496d419647ecc676b0",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/6250394c01757595e2fb954e/2106d1a9307ece89858572029679d408",
										"link": "https://images.vix.com/prd/team-logo/6250394c01757595e2fb954e/2106d1a9307ece89858572029679d408",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:LMB45134",
									"sportsEvent": {
										"id": "transmission:matchid:LMB45134",
										"name": "Olmecas de Tabasco vs Algodoneros Unión Laguna",
										"badges": [],
										"tournament": {
											"id": "LMB",
											"name": "Liga Mexicana de Beisbol",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstxV26qgmQaG5Z"
											},
											"kickoffDate": "2023-07-28T01:30:00.000Z",
											"scheduledStartTime": "2023-07-28T01:15:00.000Z",
											"scheduledEndTime": "2023-07-28T05:50:00.000Z",
											"streamId": "adstxV26qgmQaG5Z",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-LMB45134",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidlmb45134%26sports_event_mcp_id%3Dtransmissionmcpeventid6211480%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dolmecas%20de%20tabasco%20vs%20algodoneros%20union%20laguna%26sports_home_team%3Dolmecas%20de%20tabasco%26sports_away_team%3Dalgodoneros%20union%20laguna%26sports_id%3Dsoccer%26sports_title%3Dbaseball%26sports_league_id%3Dlmb%26sports_league_name%3Dliga%20mexicana%20de%20beisbol%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:LMB45134",
													"sports_event_mcp_id": "transmission:mcp:eventid:6211480",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Olmecas de Tabasco vs Algodoneros Unión Laguna",
													"sports_home_team": "Olmecas de Tabasco",
													"sports_away_team": "Algodoneros Unión Laguna",
													"sports_id": "SOCCER",
													"sports_title": "Baseball",
													"sports_league_id": "LMB",
													"sports_league_name": "Liga Mexicana de Beisbol",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "LMB15",
											"name": "Olmecas de Tabasco",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/625039fa34a8f6da1dd140b9/6c058d149c845f496d419647ecc676b0",
												"link": "https://images.vix.com/prd/team-logo/625039fa34a8f6da1dd140b9/6c058d149c845f496d419647ecc676b0",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "LMB02",
											"name": "Algodoneros Unión Laguna",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/6250394c01757595e2fb954e/2106d1a9307ece89858572029679d408",
												"link": "https://images.vix.com/prd/team-logo/6250394c01757595e2fb954e/2106d1a9307ece89858572029679d408",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d?tr=w-1800,h-1020,:oi-/prd/team-logo/625039fa34a8f6da1dd140b9/6c058d149c845f496d419647ecc676b0,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/6250394c01757595e2fb954e/2106d1a9307ece89858572029679d408,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:LMB45135",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:LMB45135",
										"ui_content_title": "Leones de Yucatán vs Sultanes de Monterrey",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/625039d5b0fd2b99f9e9aa7b/b3e8d7f0ce9f15d1c869aa3560bd9196",
										"link": "https://images.vix.com/prd/team-logo/625039d5b0fd2b99f9e9aa7b/b3e8d7f0ce9f15d1c869aa3560bd9196",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/62503a5eda9791788203abe0/514129592c85cb761fe39060b31c5fda",
										"link": "https://images.vix.com/prd/team-logo/62503a5eda9791788203abe0/514129592c85cb761fe39060b31c5fda",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:LMB45135",
									"sportsEvent": {
										"id": "transmission:matchid:LMB45135",
										"name": "Leones de Yucatán vs Sultanes de Monterrey",
										"badges": [],
										"tournament": {
											"id": "LMB",
											"name": "Liga Mexicana de Beisbol",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"link": "https://images.vix.com/prd/league/logo/6250390c159d982a326b5c9f/518de50a35308eeaba19151e550480ed",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"link": "https://images.vix.com/prd/league/splash/6250393101757595e2fb954d/4ebf3d98c2bbf6b8972a20627729d1f7",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"link": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstxV26qgmQaG5Z"
											},
											"kickoffDate": "2023-07-29T01:30:00.000Z",
											"scheduledStartTime": "2023-07-29T01:15:00.000Z",
											"scheduledEndTime": "2023-07-29T05:50:00.000Z",
											"streamId": "adstxV26qgmQaG5Z",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-LMB45135",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidlmb45135%26sports_event_mcp_id%3Dtransmissionmcpeventid6256384%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dleones%20de%20yucatan%20vs%20sultanes%20de%20monterrey%26sports_home_team%3Dleones%20de%20yucatan%26sports_away_team%3Dsultanes%20de%20monterrey%26sports_id%3Dsoccer%26sports_title%3Dbaseball%26sports_league_id%3Dlmb%26sports_league_name%3Dliga%20mexicana%20de%20beisbol%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:LMB45135",
													"sports_event_mcp_id": "transmission:mcp:eventid:6256384",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Leones de Yucatán vs Sultanes de Monterrey",
													"sports_home_team": "Leones de Yucatán",
													"sports_away_team": "Sultanes de Monterrey",
													"sports_id": "SOCCER",
													"sports_title": "Baseball",
													"sports_league_id": "LMB",
													"sports_league_name": "Liga Mexicana de Beisbol",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "LMB14",
											"name": "Leones de Yucatán",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/625039d5b0fd2b99f9e9aa7b/b3e8d7f0ce9f15d1c869aa3560bd9196",
												"link": "https://images.vix.com/prd/team-logo/625039d5b0fd2b99f9e9aa7b/b3e8d7f0ce9f15d1c869aa3560bd9196",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "LMB07",
											"name": "Sultanes de Monterrey",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/62503a5eda9791788203abe0/514129592c85cb761fe39060b31c5fda",
												"link": "https://images.vix.com/prd/team-logo/62503a5eda9791788203abe0/514129592c85cb761fe39060b31c5fda",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/625039224634b49a16b0f61c/b0bd9f03f210b5d5c516609c94d2921d?tr=w-1800,h-1020,:oi-/prd/team-logo/625039d5b0fd2b99f9e9aa7b/b3e8d7f0ce9f15d1c869aa3560bd9196,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/62503a5eda9791788203abe0/514129592c85cb761fe39060b31c5fda,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:MXF01A23US09",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:MXF01A23US09",
										"ui_content_title": "Tigres (f) vs Mazatlán (f)",
										"ui_content_type": "SportsGame",
										"ui_content_group": "promo"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
										"link": "https://images.vix.com/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
										"link": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
										"link": "https://images.vix.com/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64ac74ad5e188072a58ec7a7/921cb5433b7a3875ef21c607733bf97f",
										"link": "https://images.vix.com/prd/team-logo/64ac74ad5e188072a58ec7a7/921cb5433b7a3875ef21c607733bf97f",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b0249c92bc1276282f30d2/7caed988cec7e0d1e058aabf6a032391",
										"link": "https://images.vix.com/prd/team-logo/64b0249c92bc1276282f30d2/7caed988cec7e0d1e058aabf6a032391",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:MXF01A23US09",
									"sportsEvent": {
										"id": "transmission:matchid:MXF01A23US09",
										"name": "Tigres (f) vs Mazatlán (f)",
										"badges": ["FREE"],
										"tournament": {
											"id": "MXF01",
											"name": "Liga MX Femenil (Apertura)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
												"link": "https://images.vix.com/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
												"link": "https://images.vix.com/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
												"link": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "BEFORE_START_DATE"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst0J4VNVWKq2zX"
											},
											"kickoffDate": "2023-07-29T03:00:00.000Z",
											"scheduledStartTime": "2023-07-29T02:45:00.000Z",
											"scheduledEndTime": "2023-07-29T05:20:00.000Z",
											"streamId": "adst0J4VNVWKq2zX",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-MXF01A23US09",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidmxf01a23us09%26sports_event_mcp_id%3Dtransmissionmcpeventid6256331%26video_type%3Dliveevent%26content_group%3Dpromo%26sports_pckg%3Dligamxfemenil%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dtigres%20f%20vs%20mazatlan%20f%26sports_home_team%3Dtigres%20f%26sports_away_team%3Dmazatlan%20f%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Dmxf01%26sports_league_name%3Dliga%20mx%20femenil%20apertura%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:MXF01A23US09",
													"sports_event_mcp_id": "transmission:mcp:eventid:6256331",
													"video_type": "liveevent",
													"content_group": "promo",
													"sports_pckg": "ligamxfemenil",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Tigres (f) vs Mazatlán (f)",
													"sports_home_team": "Tigres (f)",
													"sports_away_team": "Mazatlán (f)",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "MXF01",
													"sports_league_name": "Liga MX Femenil (Apertura)",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "F1294",
											"name": "Tigres (f)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64ac74ad5e188072a58ec7a7/921cb5433b7a3875ef21c607733bf97f",
												"link": "https://images.vix.com/prd/team-logo/64ac74ad5e188072a58ec7a7/921cb5433b7a3875ef21c607733bf97f",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "F16906",
											"name": "Mazatlán (f)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b0249c92bc1276282f30d2/7caed988cec7e0d1e058aabf6a032391",
												"link": "https://images.vix.com/prd/team-logo/64b0249c92bc1276282f30d2/7caed988cec7e0d1e058aabf6a032391",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069?tr=w-1800,h-1020,:oi-/prd/team-logo/64ac74ad5e188072a58ec7a7/921cb5433b7a3875ef21c607733bf97f,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64b0249c92bc1276282f30d2/7caed988cec7e0d1e058aabf6a032391,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2383656",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2383656",
										"ui_content_title": "Correcaminos UAT vs Mineros de Zacatecas",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
										"link": "https://images.vix.com/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
										"link": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
										"link": "https://images.vix.com/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5be85ab503b5c1ce04f40/df7f0493bfe7020650b0eeedc08ee31a",
										"link": "https://images.vix.com/prd/team-logo/64b5be85ab503b5c1ce04f40/df7f0493bfe7020650b0eeedc08ee31a",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64b5bed6ba8546dd8a0c57bd/25eaeb5488c6daf4e419c39ba1be8854",
										"link": "https://images.vix.com/prd/team-logo/64b5bed6ba8546dd8a0c57bd/25eaeb5488c6daf4e419c39ba1be8854",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2383656",
									"sportsEvent": {
										"id": "transmission:matchid:2383656",
										"name": "Correcaminos UAT vs Mineros de Zacatecas",
										"badges": [],
										"tournament": {
											"id": "690",
											"name": "Liga de Expansión MX",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
												"link": "https://images.vix.com/prd/league/logo/64b0499c5fa7d9b92faaa9a5/9e8bc3054cf0f7f7592787c3900787ce",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
												"link": "https://images.vix.com/prd/league/splash/64b049b9271cafa3b2174d34/6b44e56fd8d997a20ff107b3ede32183",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
												"link": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstYRQVa8POaw4n"
											},
											"kickoffDate": "2023-07-29T03:05:00.000Z",
											"scheduledStartTime": "2023-07-29T02:50:00.000Z",
											"scheduledEndTime": "2023-07-29T05:25:00.000Z",
											"streamId": "adstYRQVa8POaw4n",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2383656",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2383656%26sports_event_mcp_id%3Dtransmissionmcpeventid6186673%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dcorrecaminos%20uat%20vs%20mineros%20de%20zacatecas%26sports_home_team%3Dcorrecaminos%20uat%26sports_away_team%3Dmineros%20de%20zacatecas%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D690%26sports_league_name%3Dliga%20de%20expansion%20mx%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2383656",
													"sports_event_mcp_id": "transmission:mcp:eventid:6186673",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Correcaminos UAT vs Mineros de Zacatecas",
													"sports_home_team": "Correcaminos UAT",
													"sports_away_team": "Mineros de Zacatecas",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "690",
													"sports_league_name": "Liga de Expansión MX",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "9487",
											"name": "Correcaminos UAT",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5be85ab503b5c1ce04f40/df7f0493bfe7020650b0eeedc08ee31a",
												"link": "https://images.vix.com/prd/team-logo/64b5be85ab503b5c1ce04f40/df7f0493bfe7020650b0eeedc08ee31a",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "9923",
											"name": "Mineros de Zacatecas",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64b5bed6ba8546dd8a0c57bd/25eaeb5488c6daf4e419c39ba1be8854",
												"link": "https://images.vix.com/prd/team-logo/64b5bed6ba8546dd8a0c57bd/25eaeb5488c6daf4e419c39ba1be8854",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64b049aa921f04fcabcfc400/74fd9060ef8cb56aaf28bf853ee2ce8c?tr=w-1800,h-1020,:oi-/prd/team-logo/64b5be85ab503b5c1ce04f40/df7f0493bfe7020650b0eeedc08ee31a,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64b5bed6ba8546dd8a0c57bd/25eaeb5488c6daf4e419c39ba1be8854,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:MXF01A23US10",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:MXF01A23US10",
										"ui_content_title": "Cruz Azul (f) vs Pumas UNAM (f)",
										"ui_content_type": "SportsGame",
										"ui_content_group": "promo"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
										"link": "https://images.vix.com/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
										"link": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
										"link": "https://images.vix.com/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64ac72b0f611ce1b829f194d/896976636275bb3166348b1f710de2fc",
										"link": "https://images.vix.com/prd/team-logo/64ac72b0f611ce1b829f194d/896976636275bb3166348b1f710de2fc",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/64ac7403fe34d3e7eb2829b7/ebafb8bc4cf1cd4a74a80122fa067bfd",
										"link": "https://images.vix.com/prd/team-logo/64ac7403fe34d3e7eb2829b7/ebafb8bc4cf1cd4a74a80122fa067bfd",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:MXF01A23US10",
									"sportsEvent": {
										"id": "transmission:matchid:MXF01A23US10",
										"name": "Cruz Azul (f) vs Pumas UNAM (f)",
										"badges": ["FREE"],
										"tournament": {
											"id": "MXF01",
											"name": "Liga MX Femenil (Apertura)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
												"link": "https://images.vix.com/prd/league/logo/64ac714cabfb3daa82f652f0/947ecb84add7e627895eda3894eede34",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
												"link": "https://images.vix.com/prd/league/splash/64ac71c45e188072a58ec129/be19f524987a10ca9a31de57b495ac49",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/jpeg",
												"filePath": "/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
												"link": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "BEFORE_START_DATE"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst0J4VNVWKq2zX"
											},
											"kickoffDate": "2023-07-29T18:00:00.000Z",
											"scheduledStartTime": "2023-07-29T17:45:00.000Z",
											"scheduledEndTime": "2023-07-29T20:20:00.000Z",
											"streamId": "adst0J4VNVWKq2zX",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-MXF01A23US10",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchidmxf01a23us10%26sports_event_mcp_id%3Dtransmissionmcpeventid6256337%26video_type%3Dliveevent%26content_group%3Dpromo%26sports_pckg%3Dligamxfemenil%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dcruz%20azul%20f%20vs%20pumas%20unam%20f%26sports_home_team%3Dcruz%20azul%20f%26sports_away_team%3Dpumas%20unam%20f%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3Dmxf01%26sports_league_name%3Dliga%20mx%20femenil%20apertura%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:MXF01A23US10",
													"sports_event_mcp_id": "transmission:mcp:eventid:6256337",
													"video_type": "liveevent",
													"content_group": "promo",
													"sports_pckg": "ligamxfemenil",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Cruz Azul (f) vs Pumas UNAM (f)",
													"sports_home_team": "Cruz Azul (f)",
													"sports_away_team": "Pumas UNAM (f)",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "MXF01",
													"sports_league_name": "Liga MX Femenil (Apertura)",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "F853",
											"name": "Cruz Azul (f)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64ac72b0f611ce1b829f194d/896976636275bb3166348b1f710de2fc",
												"link": "https://images.vix.com/prd/team-logo/64ac72b0f611ce1b829f194d/896976636275bb3166348b1f710de2fc",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "F1297",
											"name": "Pumas UNAM (f)",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/64ac7403fe34d3e7eb2829b7/ebafb8bc4cf1cd4a74a80122fa067bfd",
												"link": "https://images.vix.com/prd/team-logo/64ac7403fe34d3e7eb2829b7/ebafb8bc4cf1cd4a74a80122fa067bfd",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/64ac71b7a2f141f728da9ffa/f1a446d870f248d3d4e8c1559d0a7069?tr=w-1800,h-1020,:oi-/prd/team-logo/64ac72b0f611ce1b829f194d/896976636275bb3166348b1f710de2fc,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/64ac7403fe34d3e7eb2829b7/ebafb8bc4cf1cd4a74a80122fa067bfd,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2355578",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2355578",
										"ui_content_title": "Fluminense vs Santos",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
										"link": "https://images.vix.com/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
										"link": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
										"link": "https://images.vix.com/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
										"link": "https://images.vix.com/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/6216793aeb81d28249c78c6a/4c6b9e463432f83d9957da3a1cd3c63f",
										"link": "https://images.vix.com/prd/team-logo/6216793aeb81d28249c78c6a/4c6b9e463432f83d9957da3a1cd3c63f",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2355578",
									"sportsEvent": {
										"id": "transmission:matchid:2355578",
										"name": "Fluminense vs Santos",
										"badges": [],
										"tournament": {
											"id": "363",
											"name": "Brasileirão Serie A",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
												"link": "https://images.vix.com/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
												"link": "https://images.vix.com/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
												"link": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adst9QBkNW39N2Zo"
											},
											"kickoffDate": "2023-07-29T19:00:00.000Z",
											"scheduledStartTime": "2023-07-29T18:45:00.000Z",
											"scheduledEndTime": "2023-07-29T21:20:00.000Z",
											"streamId": "adst9QBkNW39N2Zo",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2355578",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2355578%26sports_event_mcp_id%3Dtransmissionmcpeventid6158944%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dfluminense%20vs%20santos%26sports_home_team%3Dfluminense%26sports_away_team%3Dsantos%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D363%26sports_league_name%3Dbrasileirao%20serie%20a%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2355578",
													"sports_event_mcp_id": "transmission:mcp:eventid:6158944",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Fluminense vs Santos",
													"sports_home_team": "Fluminense",
													"sports_away_team": "Santos",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "363",
													"sports_league_name": "Brasileirão Serie A",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "1734",
											"name": "Fluminense",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
												"link": "https://images.vix.com/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "1303",
											"name": "Santos",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/6216793aeb81d28249c78c6a/4c6b9e463432f83d9957da3a1cd3c63f",
												"link": "https://images.vix.com/prd/team-logo/6216793aeb81d28249c78c6a/4c6b9e463432f83d9957da3a1cd3c63f",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e?tr=w-1800,h-1020,:oi-/prd/team-logo/621678edeb81d22e28c78a7c/bcf32b2c3a8b53fbe01ad95347482929,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/6216793aeb81d28249c78c6a/4c6b9e463432f83d9957da3a1cd3c63f,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}, {
								"cursor": "transmission:matchid:2355584",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "transmission:matchid:2355584",
										"ui_content_title": "Internacional vs Cuiabá",
										"ui_content_type": "SportsGame",
										"ui_content_group": "premium"
									},
									"tournamentLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
										"link": "https://images.vix.com/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
										"imageRole": "TOURNAMENT_LOGO"
									},
									"tournamentCardBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
										"link": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
										"imageRole": "TOURNAMENT_CARD_BACKGROUND"
									},
									"tournamentSplashBackground": {
										"mediaType": "image/png",
										"filePath": "/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
										"link": "https://images.vix.com/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
										"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
									},
									"localTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/6216796beb81d2840ac78d95/0f843f98870e6681e8c850d9dd5c45f7",
										"link": "https://images.vix.com/prd/team-logo/6216796beb81d2840ac78d95/0f843f98870e6681e8c850d9dd5c45f7",
										"imageRole": "TEAM_LOGO"
									},
									"awayTeamLogo": {
										"mediaType": "image/png",
										"filePath": "/prd/team-logo/621678bceb81d29fb3c7850b/8edcd236cdf8c526f0112e8acda414eb",
										"link": "https://images.vix.com/prd/team-logo/621678bceb81d29fb3c7850b/8edcd236cdf8c526f0112e8acda414eb",
										"imageRole": "TEAM_LOGO"
									},
									"sportsEventId": "transmission:matchid:2355584",
									"sportsEvent": {
										"id": "transmission:matchid:2355584",
										"name": "Internacional vs Cuiabá",
										"badges": [],
										"tournament": {
											"id": "363",
											"name": "Brasileirão Serie A",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
												"link": "https://images.vix.com/prd/league/logo/6435ce3415f554708c919089/379bcb3175e271e594c33f04c93cae07",
												"imageRole": "TOURNAMENT_LOGO"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
												"link": "https://images.vix.com/prd/league/splash/621676aceb81d2a6e7c771b7/90c5ebfeda7523b01204354e8ae77f50",
												"imageRole": "TOURNAMENT_SPLASH_BACKGROUND"
											}, {
												"mediaType": "image/png",
												"filePath": "/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
												"link": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e",
												"imageRole": "TOURNAMENT_CARD_BACKGROUND"
											}],
											"tournamentType": "LEAGUE"
										},
										"vodAvailability": {
											"isBlocked": true,
											"reason": "REQUIRES_SUBSCRIPTION"
										},
										"playbackData": {
											"stream": {
												"mcpId": "adstV2v5NBn1N1EZ"
											},
											"kickoffDate": "2023-07-29T19:00:00.000Z",
											"scheduledStartTime": "2023-07-29T18:45:00.000Z",
											"scheduledEndTime": "2023-07-29T21:20:00.000Z",
											"streamId": "adstV2v5NBn1N1EZ",
											"trackingMetadata": {
												"advertisingMetadata": {
													"adUnit": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
													"adConfiguration": {
														"server_url": "https://pubads.g.doubleclick.net/gampad/ads?",
														"env": "vp",
														"impl": "s",
														"correlator": "",
														"tfcd": "0",
														"npa": "0",
														"gdfp_req": "1",
														"sz": "640x480",
														"unviewed_position_start": "1",
														"vad_type": "linear",
														"vpa": "1",
														"url": "https://www.vix.com",
														"description_url": "https://www.vix.com/live/transmission-matchid-2355584",
														"vconp": "0",
														"ss_req": "1",
														"vpi": "1",
														"iu": "/6881/vix.tv/viewer/live/ios/deportes_livestream",
														"cust_params": "stream_type%3Dlive%26sports_event_id%3Dtransmissionmatchid2355584%26sports_event_mcp_id%3Dtransmissionmcpeventid6158945%26video_type%3Dliveevent%26content_group%3Dpremium%26is_epg%3Dfalse%26navigation_section%3Dondemand2%26carousel_id%3D%26carousel_title%3D%26is_recommendation%3Dfalse%26sports_event_title%3Dinternacional%20vs%20cuiaba%26sports_home_team%3Dinternacional%26sports_away_team%3Dcuiaba%26sports_id%3Dsoccer%26sports_title%3Dsoccer%26sports_league_id%3D363%26sports_league_name%3Dbrasileirao%20serie%20a%26video_content_vertical%3Dsports%26video_genres%3Dsports%26video_genres_first%3Dsports%26video_is_kids%3Dfalse%26video_rating%3Dunrated"
													}
												},
												"sharedMetadataJson": {
													"stream_type": "live",
													"sports_event_id": "transmission:matchid:2355584",
													"sports_event_mcp_id": "transmission:mcp:eventid:6158945",
													"video_type": "liveevent",
													"content_group": "premium",
													"is_epg": "false",
													"navigation_section": "ondemand2",
													"carousel_id": "",
													"carousel_title": "",
													"is_recommendation": "false",
													"sports_event_title": "Internacional vs Cuiabá",
													"sports_home_team": "Internacional",
													"sports_away_team": "Cuiabá",
													"sports_id": "SOCCER",
													"sports_title": "Soccer",
													"sports_league_id": "363",
													"sports_league_name": "Brasileirão Serie A",
													"video_content_vertical": "sports",
													"video_genres": "sports",
													"video_genres_first": "sports",
													"video_is_kids": "false",
													"video_rating": "unrated"
												},
												"advertisingMetadataJson": {},
												"analyticsMetadataJson": {}
											}
										},
										"localTeam": {
											"id": "602",
											"name": "Internacional",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/6216796beb81d2840ac78d95/0f843f98870e6681e8c850d9dd5c45f7",
												"link": "https://images.vix.com/prd/team-logo/6216796beb81d2840ac78d95/0f843f98870e6681e8c850d9dd5c45f7",
												"imageRole": "TEAM_LOGO"
											}]
										},
										"awayTeam": {
											"id": "9709",
											"name": "Cuiabá",
											"imageAssets": [{
												"mediaType": "image/png",
												"filePath": "/prd/team-logo/621678bceb81d29fb3c7850b/8edcd236cdf8c526f0112e8acda414eb",
												"link": "https://images.vix.com/prd/team-logo/621678bceb81d29fb3c7850b/8edcd236cdf8c526f0112e8acda414eb",
												"imageRole": "TEAM_LOGO"
											}]
										}
									},
									"compositeImageLink": "https://images.vix.com/prd/league/card/6216769deb81d29924c770c5/47f1beb03d7b00c55a21c052c558dd1e?tr=w-1800,h-1020,:oi-/prd/team-logo/6216796beb81d2840ac78d95/0f843f98870e6681e8c850d9dd5c45f7,ox-243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168,:oi-/prd/team-logo/621678bceb81d29fb3c7850b/8edcd236cdf8c526f0112e8acda414eb,ox-N243,oic-at_max,oit-false,oicm-pad_resize,oh-684,ow-588,oy-168"
								}
							}]
						}
					}
				}, {
					"cursor": "e6ca59ab82c91a77a999d39443e72e16285b8391",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "e6ca59ab82c91a77a999d39443e72e16285b8391",
							"ui_module_title": "Se despiden pronto",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "VIDEO_CAROUSEL"
						},
						"id": "e6ca59ab82c91a77a999d39443e72e16285b8391",
						"trackingId": "e6ca59ab82c91a77a999d39443e72e16285b8391",
						"moduleType": "VIDEO_CAROUSEL",
						"treatment": "PORTRAIT",
						"title": "Se despiden pronto",
						"caption": null,
						"landscapeFillImage": null,
						"portraitFillImage": null,
						"contents": {
							"totalCount": 24,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "video:mcp:4009671",
								"endCursor": "video:mcp:4091330"
							},
							"edges": [{
								"cursor": "video:mcp:4009671",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4009671",
										"ui_content_title": "Gods of Egypt",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4009671/167053ecd23ce4a5809116762cf70215",
										"link": "https://images.vix.com/prd/videos/video:mcp:4009671/167053ecd23ce4a5809116762cf70215",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4009671",
										"videoType": "MOVIE",
										"dateModified": "2023-05-02T21:44:04.171Z",
										"dateReleased": "2023-07-01T04:00:00.000Z",
										"copyrightYear": 2016,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["V"]
										}],
										"language": "es",
										"title": "Gods of Egypt",
										"description": "Gerard Butler y Nikolaj Coster-Waldau interpretan a dioses rivales enzarzados en una batalla épica para decidir el destino del universo en esta emocionante aventura de fantasía.",
										"genres": ["Acción", "Aventura", "Fantasía"],
										"contributors": [{
											"name": "Gerard Butler",
											"roles": ["ACTOR"]
										}, {
											"name": "Nikolaj Coster-Waldau",
											"roles": ["ACTOR"]
										}, {
											"name": "Brenton Thwaites",
											"roles": ["ACTOR"]
										}, {
											"name": "Geoffrey Rush",
											"roles": ["ACTOR"]
										}, {
											"name": "Courtney Eaton",
											"roles": ["ACTOR"]
										}, {
											"name": "Chadwick Boseman",
											"roles": ["ACTOR"]
										}, {
											"name": "Bryan Brown",
											"roles": ["ACTOR"]
										}, {
											"name": "Elodie Yung",
											"roles": ["ACTOR"]
										}, {
											"name": "Rachael Blake",
											"roles": ["ACTOR"]
										}, {
											"name": "Alex Proyas",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Matt Sazama",
											"roles": []
										}, {
											"name": "Burk Sharpless",
											"roles": []
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/167053ecd23ce4a5809116762cf70215",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/167053ecd23ce4a5809116762cf70215",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/fe6af1b978a91d19708859a64de59c3e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/fe6af1b978a91d19708859a64de59c3e",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/bf686e328072726852cb4408ecf9ef81",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/bf686e328072726852cb4408ecf9ef81",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/212fb83ce2110c11bcc773c38e2fa77c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/212fb83ce2110c11bcc773c38e2fa77c",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/bcecb17731d04bb102cf0cf21cb38f84",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/bcecb17731d04bb102cf0cf21cb38f84",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/2e8a6d2c0cff073c435b600446280520",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/2e8a6d2c0cff073c435b600446280520",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4009671/a42942b4cdf3bc4a2b9979c7bbe7022c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4009671/a42942b4cdf3bc4a2b9979c7bbe7022c",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4009671"
												},
												"streamMetadata": {
													"duration": 6597,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}, {
								"cursor": "video:mcp:4092198",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4092198",
										"ui_content_title": "The Act",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4092198/08980a3d0a8e29ceb1eb132b89cf78c1",
										"link": "https://images.vix.com/prd/videos/video:mcp:4092198/08980a3d0a8e29ceb1eb132b89cf78c1",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4092198",
										"videoType": "MOVIE",
										"dateModified": "2023-07-17T19:14:56.512Z",
										"dateReleased": "2021-08-01T04:00:00.000Z",
										"copyrightYear": 1984,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "V"]
										}],
										"language": "es",
										"title": "The Act",
										"description": "Frankie Boda le paga al presidente dos millones de dólares como parte de un trato para liberar a Harry Kruger de la cárcel. Chantajea a un fugitivo de la prisión y a su grupo de actores para que le lleven a cabo el atraco.",
										"genres": ["Comedia", "Thrillers"],
										"contributors": [{
											"name": "Sig Shore",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Eddie Albert",
											"roles": ["ACTOR"]
										}, {
											"name": "Pat Hingle",
											"roles": ["ACTOR"]
										}, {
											"name": "Jill St. John",
											"roles": ["ACTOR"]
										}, {
											"name": "David Huddleston",
											"roles": ["ACTOR"]
										}, {
											"name": "John Cullum",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/08980a3d0a8e29ceb1eb132b89cf78c1",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/08980a3d0a8e29ceb1eb132b89cf78c1",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/153a1b057b1e8a8e771db746cc3ba2e4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/153a1b057b1e8a8e771db746cc3ba2e4",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/f7665760559b0423ed015763ea1de5bb",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/f7665760559b0423ed015763ea1de5bb",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/e142f4a15a802a99d5eeb44d522857a6",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/e142f4a15a802a99d5eeb44d522857a6",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/7eb1c86d473be2e4a1754cf486a1ce1e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/7eb1c86d473be2e4a1754cf486a1ce1e",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/41d80cdf99cd9c54bf4c0524689b78c9",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/41d80cdf99cd9c54bf4c0524689b78c9",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4092198/88e12abe3258fefb5eeb8ac2f5fff224",
											"link": "https://images.vix.com/prd/videos/video:mcp:4092198/88e12abe3258fefb5eeb8ac2f5fff224",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4092198"
												},
												"streamMetadata": {
													"duration": 5654,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}, {
								"cursor": "video:mcp:4118133",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4118133",
										"ui_content_title": "Vehicle 19",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4118133/3ee789a014e67936eb618a91d3ea97fc",
										"link": "https://images.vix.com/prd/videos/video:mcp:4118133/3ee789a014e67936eb618a91d3ea97fc",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4118133",
										"videoType": "MOVIE",
										"dateModified": "2023-06-29T16:03:55.981Z",
										"dateReleased": "2023-07-01T04:00:00.000Z",
										"copyrightYear": 2013,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L", "V"]
										}],
										"language": "es",
										"title": "Vehicle 19",
										"description": "En Johannesburgo, un hombre tiene una infracción de su libertad condicional y decide robar un auto de alquiler, sin saber que el vehículo lo va a atar a una red de policías locales corruptos quienes harán cualquier cosa por evitar un testimonio.",
										"genres": ["Acción", "Thrillers"],
										"contributors": [{
											"name": "Mukunda Michael Dewil",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Paul Walker",
											"roles": ["ACTOR"]
										}, {
											"name": "Gys De Villiers",
											"roles": ["ACTOR"]
										}, {
											"name": "Naima Mclean",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/3ee789a014e67936eb618a91d3ea97fc",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/3ee789a014e67936eb618a91d3ea97fc",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/a9a40fca639ac53f9f9b3af1194acdb8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/a9a40fca639ac53f9f9b3af1194acdb8",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/b056e1155090f8ea3a5a7f39fff27c61",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/b056e1155090f8ea3a5a7f39fff27c61",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/70937df4cb44b7cfa7bb669dc0ddf55e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/70937df4cb44b7cfa7bb669dc0ddf55e",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/86ee87d5a9888dde05f3d63694929daa",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/86ee87d5a9888dde05f3d63694929daa",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/6425cd6449fe749875b0b4059ce2cd18",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/6425cd6449fe749875b0b4059ce2cd18",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4118133/1937ed06e0f1927ff0d0a2df2fbced2f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4118133/1937ed06e0f1927ff0d0a2df2fbced2f",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4118133"
												},
												"streamMetadata": {
													"duration": 5113,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}, {
								"cursor": "video:mcp:4091265",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4091265",
										"ui_content_title": "100 Años de Comedia",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4091265/124205213fcad291ef2f1293b98ade16",
										"link": "https://images.vix.com/prd/videos/video:mcp:4091265/124205213fcad291ef2f1293b98ade16",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4091265",
										"videoType": "MOVIE",
										"dateModified": "2023-07-17T19:14:37.397Z",
										"dateReleased": "2021-08-01T04:00:00.000Z",
										"copyrightYear": 1997,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-PG",
											"ratingSubValues": ["D"]
										}],
										"language": "es",
										"title": "100 Años de Comedia",
										"description": "Los artistas más famosos de la comedia se presentan en este documental que narra la historia del género, pues es una categoría muy especial pues para hacerla brillante se necesitan comediantes brillantes.",
										"genres": ["Comedia", "Documental", "Familiar"],
										"contributors": [{
											"name": "Phillip Dye",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Bill Murray",
											"roles": ["ACTOR"]
										}, {
											"name": "Buster Keaton",
											"roles": ["ACTOR"]
										}, {
											"name": "Charlie Chaplin",
											"roles": ["ACTOR"]
										}, {
											"name": "Mark Bollinger",
											"roles": ["ACTOR"]
										}, {
											"name": "Bob Hope",
											"roles": ["ACTOR"]
										}, {
											"name": "Cary Grant",
											"roles": ["ACTOR"]
										}, {
											"name": "Jim Carrey",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/124205213fcad291ef2f1293b98ade16",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/124205213fcad291ef2f1293b98ade16",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/6ef9f1ab6ec99fdb004b64bd3855441a",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/6ef9f1ab6ec99fdb004b64bd3855441a",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/d60a3c18e0b241ba77defaf75f09bc6d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/d60a3c18e0b241ba77defaf75f09bc6d",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/d66d18183d5c458cf4ba489f1457fdce",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/d66d18183d5c458cf4ba489f1457fdce",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/0b29c423c2516e43ec57fe5c5627f812",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/0b29c423c2516e43ec57fe5c5627f812",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/d1708e082f9f7a37b4bf76ffd26918e5",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/d1708e082f9f7a37b4bf76ffd26918e5",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091265/d1708e082f9f7a37b4bf76ffd26918e5",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091265/d1708e082f9f7a37b4bf76ffd26918e5",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4091265"
												},
												"streamMetadata": {
													"duration": 6003,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}, {
								"cursor": "video:mcp:4091304",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4091304",
										"ui_content_title": "Alley Cat",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4091304/84222221c26d76a68b130ec03400e0e2",
										"link": "https://images.vix.com/prd/videos/video:mcp:4091304/84222221c26d76a68b130ec03400e0e2",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4091304",
										"videoType": "MOVIE",
										"dateModified": "2023-07-17T19:14:45.254Z",
										"dateReleased": "2021-08-01T04:00:00.000Z",
										"copyrightYear": 1984,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": "es",
										"title": "Alley Cat",
										"description": "Billie Clark tiene veinte años, es inteligente, bonita y es cinturón negro en karate. Cuando la joven experta en artes marciales atrapa a una pandilla que roba neumáticos, la pandilla la acusa de asesinato, y sus abuelos mueren en su lugar.",
										"genres": ["Acción", "Drama", "Thrillers"],
										"contributors": [{
											"name": "Victor M. Ordoñez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Ed Palmos",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Al Valletta",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Robert Torti",
											"roles": ["ACTOR"]
										}, {
											"name": "Michael Wayne",
											"roles": ["ACTOR"]
										}, {
											"name": "Karin Mani",
											"roles": ["ACTOR"]
										}, {
											"name": "Britt Helfer",
											"roles": ["ACTOR"]
										}, {
											"name": "Jon Greene",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/84222221c26d76a68b130ec03400e0e2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/84222221c26d76a68b130ec03400e0e2",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/bbf5fd0cad0196a4e1ce334ec0f47f94",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/bbf5fd0cad0196a4e1ce334ec0f47f94",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/a24e9dc70b24cc1817d7ccacd18f828e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/a24e9dc70b24cc1817d7ccacd18f828e",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/c8442b39fea5c56279a1885ee1e98ff9",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/c8442b39fea5c56279a1885ee1e98ff9",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/544fcd235aa6d57e5bfb471c5202c7d2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/544fcd235aa6d57e5bfb471c5202c7d2",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/5f624978a50b3444e852acc2fcbe85bc",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/5f624978a50b3444e852acc2fcbe85bc",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091304/d908edd7a5997466b58e6d5418e9a57c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091304/d908edd7a5997466b58e6d5418e9a57c",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4091304"
												},
												"streamMetadata": {
													"duration": 4978,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}, {
								"cursor": "video:mcp:4091330",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "video:mcp:4091330",
										"ui_content_title": "El Bebé de la Novia",
										"ui_content_type": "MOVIE",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4091330/44315d1632b9f0d2a16a58c784d9823e",
										"link": "https://images.vix.com/prd/videos/video:mcp:4091330/44315d1632b9f0d2a16a58c784d9823e",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "video:mcp:4091330",
										"videoType": "MOVIE",
										"dateModified": "2023-07-17T19:15:23.192Z",
										"dateReleased": "2021-08-01T04:00:00.000Z",
										"copyrightYear": 1991,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D"]
										}],
										"language": "es",
										"title": "El Bebé de la Novia",
										"description": "Poco después de regresar de su luna de miel, John y Margret Hix reciben la sorpresa de su vida. ¡A los 53 años, Margret está embarazada! No es la única de la familia que está embarazada. Mary, la hija de Margret, dará a luz pocos meses antes que su madre.",
										"genres": ["Comedia", "Romance", "Drama"],
										"contributors": [{
											"name": "Bill Bixby",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Kristy McNichol",
											"roles": ["ACTOR"]
										}, {
											"name": "Beverley Mitchell",
											"roles": ["ACTOR"]
										}, {
											"name": "Rue Mcclanahan",
											"roles": ["ACTOR"]
										}, {
											"name": "John Wesley Shipp",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/44315d1632b9f0d2a16a58c784d9823e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/44315d1632b9f0d2a16a58c784d9823e",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/b23683fc07e03faf395d466a2ece34b1",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/b23683fc07e03faf395d466a2ece34b1",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/671c4956094868af3daf8b376b136459",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/671c4956094868af3daf8b376b136459",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/aba07c976aa8e14c543579955074681f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/aba07c976aa8e14c543579955074681f",
											"imageRole": "MISCELLANEOUS"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/e14a90457d3e085da9e3caa46359f985",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/e14a90457d3e085da9e3caa46359f985",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/08327beb73d5a6703fba5886c605fe3c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/08327beb73d5a6703fba5886c605fe3c",
											"imageRole": "HORIZONTAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4091330/ed68d13a4e5d169fef239d3f79157b6f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4091330/ed68d13a4e5d169fef239d3f79157b6f",
											"imageRole": "SNAPSHOT"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {
											"playbackData": {
												"stream": {
													"mcpId": "4091330"
												},
												"streamMetadata": {
													"duration": 5654,
													"introStartPosition": null,
													"introEndPosition": null,
													"outroStartPosition": null,
													"introSkippable": false,
													"outroSkippable": false
												}
											}
										}
									}
								}
							}]
						}
					}
				}, {
					"cursor": "e5956f04da6dcf676effaf4eca0b69a4a7765114",
					"node": {
						"trackingMetadataJson": {
							"ui_module_id": "e5956f04da6dcf676effaf4eca0b69a4a7765114",
							"ui_module_title": "Series más vistas",
							"ui_navigation_section": "/ondemand2",
							"ui_is_recommendation": false,
							"ui_object_type": "VIDEO_CAROUSEL"
						},
						"id": "e5956f04da6dcf676effaf4eca0b69a4a7765114",
						"trackingId": "e5956f04da6dcf676effaf4eca0b69a4a7765114",
						"moduleType": "VIDEO_CAROUSEL",
						"treatment": "PORTRAIT",
						"title": "Series más vistas",
						"caption": null,
						"landscapeFillImage": null,
						"portraitFillImage": null,
						"contents": {
							"totalCount": 103,
							"pageInfo": {
								"hasPreviousPage": false,
								"hasNextPage": true,
								"startCursor": "series:mcp:1116",
								"endCursor": "series:mcp:4279"
							},
							"edges": [{
								"cursor": "series:mcp:1116",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:1116",
										"ui_content_title": "Lady, La Vendedora de Rosas",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4250944/846d8f72d9c42f4748d00bd8fb44dc79",
										"link": "https://images.vix.com/prd/videos/video:mcp:4250944/846d8f72d9c42f4748d00bd8fb44dc79",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:1116",
										"videoType": "SERIES",
										"dateModified": "2023-05-03T15:57:39.176Z",
										"dateReleased": "2022-09-01T04:00:00.000Z",
										"copyrightYear": 2014,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "V"]
										}],
										"language": null,
										"title": "Lady, La Vendedora de Rosas",
										"description": "Lady es una hermosa niña que roba rosas para venderlas y llevar el sustento a su hogar. Mientras trabaja como vendedora callejera su vida recibirá un golpe de suerte que la hará tocar el cielo pero al mismo tiempo conocer el infierno.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Ernesto Benjumea",
											"roles": ["ACTOR"]
										}, {
											"name": "Natalia Reyes",
											"roles": ["ACTOR"]
										}, {
											"name": "Felipe Cano",
											"roles": ["DIRECTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4250944/846d8f72d9c42f4748d00bd8fb44dc79",
											"link": "https://images.vix.com/prd/videos/video:mcp:4250944/846d8f72d9c42f4748d00bd8fb44dc79",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4250944/db51a6b46b2b802e05704d2bda5af943",
											"link": "https://images.vix.com/prd/videos/video:mcp:4250944/db51a6b46b2b802e05704d2bda5af943",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4250944/2384852710b23174c7e663c5e5dc574f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4250944/2384852710b23174c7e663c5e5dc574f",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4250944/f141e99731509db625a5cc14b2c7701e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4250944/f141e99731509db625a5cc14b2c7701e",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4250944/06d5817eea9b952e0ed152f2cf3badb2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4250944/06d5817eea9b952e0ed152f2cf3badb2",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3856",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3856",
										"ui_content_title": "De viaje con los Derbez",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
										"link": "https://images.vix.com/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3856",
										"videoType": "SERIES",
										"dateModified": "2023-07-14T17:19:41.866Z",
										"dateReleased": "2023-04-07T04:00:00.000Z",
										"copyrightYear": 2019,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "L"]
										}],
										"language": null,
										"title": "De viaje con los Derbez",
										"description": "¡Y están de regreso! La divertida y adorable familia Derbez viaja de nuevo, pero en esta temporada, viajarán a Jamaica.. Para un viaje espiritual, emocionante, divertido,lleno de peligo, mucho amor y drama.",
										"genres": ["Comedia", "Viajes"],
										"contributors": [{
											"name": "Pablo Calasso",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Eugenio Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Aislinn Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "José Eduardo Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Vadhir Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Alessandra Rosaldo",
											"roles": ["ACTOR"]
										}, {
											"name": "Aitana Derbez",
											"roles": ["ACTOR"]
										}, {
											"name": "Kailani",
											"roles": ["ACTOR"]
										}, {
											"name": "Mauricio Ochmann",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/d9888d84078a2d0f73772aa93774d703",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/786d59fdae99c4948a547f91f85635d9",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/786d59fdae99c4948a547f91f85635d9",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/4047cda8223685fd82007645370aaac6",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/4047cda8223685fd82007645370aaac6",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/9e24330f54df1712258036fb3b8c36d4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/9e24330f54df1712258036fb3b8c36d4",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4375611/640b82c951ea7f699fa4c036f028bcca",
											"link": "https://images.vix.com/prd/videos/video:mcp:4375611/640b82c951ea7f699fa4c036f028bcca",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3788",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3788",
										"ui_content_title": "María Félix",
										"ui_content_type": "SERIES",
										"ui_content_group": "first_party, promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
										"link": "https://images.vix.com/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3788",
										"videoType": "SERIES",
										"dateModified": "2023-06-28T00:03:26.260Z",
										"dateReleased": "2022-07-11T04:00:00.000Z",
										"copyrightYear": 2022,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "María Félix",
										"description": "Esta es la historia de una mujer adelantada a su época, que enfrentó un mundo de hombres y se ganó su lugar. De espectacular belleza, vestida de pantalones, con la  ceja levantada y la voz grave, se convirtió en la máxima diva del cine mexicano.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Mafer Suárez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Emiliano González",
											"roles": ["ACTOR"]
										}, {
											"name": "Sandra Echeverría",
											"roles": ["ACTOR"]
										}, {
											"name": "Guillermo García Cantú",
											"roles": ["ACTOR"]
										}, {
											"name": "Iker Madrid",
											"roles": ["ACTOR"]
										}, {
											"name": "Ximena Romo",
											"roles": ["ACTOR"]
										}, {
											"name": "Abril Vergara",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/078778a7ef589d04a22e91d6fad05f31",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/c72a949b8a1c872a0ee11b3063d8a0f8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/c72a949b8a1c872a0ee11b3063d8a0f8",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/cf1772800b7e5e041dffac042eba9485",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/cf1772800b7e5e041dffac042eba9485",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/58fda1b58ecfd97a2ea8b67f6eacfde4",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/58fda1b58ecfd97a2ea8b67f6eacfde4",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4273247/114819ecaafdb07e25255dcbdd6651c8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4273247/114819ecaafdb07e25255dcbdd6651c8",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3327",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3327",
										"ui_content_title": "Nuevo Sol",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4201011/629efb20997f5ee4f6033755770885d8",
										"link": "https://images.vix.com/prd/videos/video:mcp:4201011/629efb20997f5ee4f6033755770885d8",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3327",
										"videoType": "SERIES",
										"dateModified": "2023-07-21T21:24:31.467Z",
										"dateReleased": "2022-08-01T04:00:00.000Z",
										"copyrightYear": 2018,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "V"]
										}],
										"language": null,
										"title": "Nuevo Sol",
										"description": "Lucía (Giovanna Antonelli) es una madre trabajadora que vive en la isla paradisíaca de Boiporá y cría sola a los pequeños Ícaro (Thales Miranda/Chay Suede) y Manuela (Rafaela Brasil/Luisa Arraes)",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Emilio Dantas",
											"roles": ["ACTOR"]
										}, {
											"name": "Giovanna Antonelli",
											"roles": ["ACTOR"]
										}, {
											"name": "Deborah Secco",
											"roles": ["ACTOR"]
										}, {
											"name": "Chay Suede",
											"roles": ["ACTOR"]
										}, {
											"name": "Carla Bohler",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Maria De Medicis",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Noa Bressane",
											"roles": ["DIRECTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201011/629efb20997f5ee4f6033755770885d8",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201011/629efb20997f5ee4f6033755770885d8",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201011/4a0390cd1477c67bf26e9157c7b90a4c",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201011/4a0390cd1477c67bf26e9157c7b90a4c",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201011/391183a5aee6960d98df072d5a780fdb",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201011/391183a5aee6960d98df072d5a780fdb",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201011/49f6fb1584e6038b4e9fac9a720587fc",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201011/49f6fb1584e6038b4e9fac9a720587fc",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201011/60e8eb360e6d13be6a358e1749af501e",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201011/60e8eb360e6d13be6a358e1749af501e",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:3328",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:3328",
										"ui_content_title": "Querer Sin Limites",
										"ui_content_type": "SERIES",
										"ui_content_group": "promo"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4201191/cf3a08d54361ec765354db8ac82da22b",
										"link": "https://images.vix.com/prd/videos/video:mcp:4201191/cf3a08d54361ec765354db8ac82da22b",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:3328",
										"videoType": "SERIES",
										"dateModified": "2023-05-03T16:53:08.947Z",
										"dateReleased": "2022-03-31T04:00:00.000Z",
										"copyrightYear": 2017,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-14",
											"ratingSubValues": ["D", "V"]
										}],
										"language": null,
										"title": "Querer Sin Limites",
										"description": "Sigue las luchas personales y románticas de tres mujeres de voluntad fuerte que tienen una cosa en común: la tenacidad de superar todos los límites para lograr lo que desean.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Marco Pigossi",
											"roles": ["ACTOR"]
										}, {
											"name": "Juliana Paes",
											"roles": ["ACTOR"]
										}, {
											"name": "Isis Valverde",
											"roles": ["ACTOR"]
										}, {
											"name": "Paolla Oliveira",
											"roles": ["ACTOR"]
										}, {
											"name": "Pedro Vasconcelos",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Cláudio Boeckel",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Davi Lacerda",
											"roles": ["DIRECTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201191/cf3a08d54361ec765354db8ac82da22b",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201191/cf3a08d54361ec765354db8ac82da22b",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201191/c8e579ca49805d05243efad06e031565",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201191/c8e579ca49805d05243efad06e031565",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201191/058927fdaf3c034298fbe8e2927550e2",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201191/058927fdaf3c034298fbe8e2927550e2",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201191/3904882d9681b751e93d95936522629d",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201191/3904882d9681b751e93d95936522629d",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4201191/ae959bd97c7384fdba634d31a1e61ad3",
											"link": "https://images.vix.com/prd/videos/video:mcp:4201191/ae959bd97c7384fdba634d31a1e61ad3",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": [],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}, {
								"cursor": "series:mcp:4279",
								"node": {
									"clickTrackingJson": {
										"ui_content_id": "series:mcp:4279",
										"ui_content_title": "Paraíso blanco",
										"ui_content_type": "SERIES",
										"ui_content_group": "premium"
									},
									"image": {
										"mediaType": "image/jpeg",
										"filePath": "/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
										"link": "https://images.vix.com/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
										"imageRole": "VERTICAL_POSTER"
									},
									"video": {
										"id": "series:mcp:4279",
										"videoType": "SERIES",
										"dateModified": "2023-07-18T23:26:40.699Z",
										"dateReleased": "2023-07-20T04:00:00.000Z",
										"copyrightYear": 2023,
										"contentUsage": null,
										"ratings": [{
											"ratingValue": "TV-MA",
											"ratingSubValues": []
										}],
										"language": null,
										"title": "Paraíso blanco",
										"description": "La bio serie de Carlos Lehder, después de pasar 30 años en la cárcel regresa a Alemania con su hija Julie, recordando todo lo que dejó atrás.",
										"genres": ["Drama"],
										"contributors": [{
											"name": "Camilo Villamizar",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Juan Vázquez",
											"roles": ["DIRECTOR"]
										}, {
											"name": "Sebastián Osorio",
											"roles": ["ACTOR"]
										}, {
											"name": "Variel Sánchez",
											"roles": ["ACTOR"]
										}, {
											"name": "César Álvarez",
											"roles": ["ACTOR"]
										}, {
											"name": "Michal Malinowski",
											"roles": ["ACTOR"]
										}, {
											"name": "Bibiana Navas",
											"roles": ["ACTOR"]
										}, {
											"name": "Isabella Miranda",
											"roles": ["ACTOR"]
										}, {
											"name": "Valeria Galviz",
											"roles": ["ACTOR"]
										}],
										"imageAssets": [{
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/40e514d0b676c34d78cd5c8033aded6f",
											"imageRole": "VERTICAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/64907018cc5b1df1ef386b00f1bf3458",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/64907018cc5b1df1ef386b00f1bf3458",
											"imageRole": "HORIZONTAL_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/9d657716b9b641226a7aa0e91861c323",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/9d657716b9b641226a7aa0e91861c323",
											"imageRole": "SQUARE_POSTER"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/24c4e9defb9833f39a3eed6bde73f5dd",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/24c4e9defb9833f39a3eed6bde73f5dd",
											"imageRole": "VERTICAL_HERO"
										}, {
											"mediaType": "image/jpeg",
											"filePath": "/prd/videos/video:mcp:4394544/db26856831c073d1493aa62b106de720",
											"link": "https://images.vix.com/prd/videos/video:mcp:4394544/db26856831c073d1493aa62b106de720",
											"imageRole": "HORIZONTAL_HERO"
										}],
										"badges": ["NEW_EPISODES"],
										"vodAvailability": {
											"isBlocked": false,
											"reason": null
										},
										"videoTypeData": {}
									}
								}
							}]
						}
					}
				}]
			}
		}
	}
}"""

    @Test
    fun testSerialization(){
        runBlocking {
            val list = NodeRepositoryImp(json).getNodes().first()
            Assert.assertTrue(list.isNotEmpty())
            list.first().let {
                Assert.assertTrue(it.list.isNotEmpty())
                it.list.first().let{
                    Assert.assertTrue(it.name.isNotEmpty())
                    Assert.assertTrue(it.description.isNotEmpty())
                    Assert.assertTrue(it.imageUrl.isNotEmpty())
                    Assert.assertTrue(it.imageBackUrl.isNotEmpty())
                    Assert.assertTrue(it.director.isNotEmpty())
                    Assert.assertTrue(it.staff.isNotEmpty())
                    Assert.assertTrue(it.genres.isNotEmpty())
                }
            }
        }
    }
}
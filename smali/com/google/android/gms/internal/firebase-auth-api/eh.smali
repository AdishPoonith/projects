.class final Lcom/google/android/gms/internal/firebase-auth-api/eh;
.super Lcom/google/android/gms/internal/firebase-auth-api/gj;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/fh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/fh;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/eh;->b:Lcom/google/android/gms/internal/firebase-auth-api/fh;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/gj;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->F()Lcom/google/android/gms/internal/firebase-auth-api/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bq;->G()Lcom/google/android/gms/internal/firebase-auth-api/lq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->H()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/oh;->c(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->i(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bu;->c(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/iq;->E()Lcom/google/android/gms/internal/firebase-auth-api/hq;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hq;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/hq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->F()Lcom/google/android/gms/internal/firebase-auth-api/bq;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hq;->r(Lcom/google/android/gms/internal/firebase-auth-api/bq;)Lcom/google/android/gms/internal/firebase-auth-api/hq;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/m4;->k:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    array-length v4, p1

    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hq;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/hq;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    array-length v1, p1

    invoke-static {p1, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hq;->u(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/hq;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/iq;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fq;->D()Lcom/google/android/gms/internal/firebase-auth-api/dq;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/dq;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/dq;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/dq;->s(Lcom/google/android/gms/internal/firebase-auth-api/iq;)Lcom/google/android/gms/internal/firebase-auth-api/dq;

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    array-length v0, p1

    invoke-static {p1, v3, v0}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->w([BII)Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/dq;->r(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/dq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fq;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->E(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/yp;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_GCM"

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    const/4 v6, 0x4

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v1

    const-string v2, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES128_CTR_HMAC_SHA256"

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    const/4 v6, 0x4

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ka;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->l()[B

    move-result-object v8

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/fh;->m(IIILcom/google/android/gms/internal/firebase-auth-api/ja;[BI)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v1

    const-string v2, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->F()Lcom/google/android/gms/internal/firebase-auth-api/bq;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/oh;->a(Lcom/google/android/gms/internal/firebase-auth-api/bq;)V

    return-void
.end method

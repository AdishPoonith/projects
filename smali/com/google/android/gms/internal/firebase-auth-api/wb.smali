.class final Lcom/google/android/gms/internal/firebase-auth-api/wb;
.super Lcom/google/android/gms/internal/firebase-auth-api/gj;
.source "SourceFile"


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/xb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xb;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wb;->b:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/gj;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yn;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lc;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->F()Lcom/google/android/gms/internal/firebase-auth-api/fo;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kc;->g(Lcom/google/android/gms/internal/firebase-auth-api/fo;)Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->a()Lcom/google/android/gms/internal/firebase-auth-api/gj;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->G()Lcom/google/android/gms/internal/firebase-auth-api/yq;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gj;->a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->D()Lcom/google/android/gms/internal/firebase-auth-api/un;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/un;->r(Lcom/google/android/gms/internal/firebase-auth-api/bo;)Lcom/google/android/gms/internal/firebase-auth-api/un;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vq;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/un;->s(Lcom/google/android/gms/internal/firebase-auth-api/vq;)Lcom/google/android/gms/internal/firebase-auth-api/un;

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/un;->t(I)Lcom/google/android/gms/internal/firebase-auth-api/un;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vn;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->E(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/yn;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v4, 0x10

    const/16 v3, 0x20

    const/4 v5, 0x5

    const/4 v6, 0x1

    move v1, v4

    move v2, v4

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0x10

    const/16 v5, 0x20

    const/4 v7, 0x5

    const/4 v8, 0x3

    move v3, v6

    move v4, v6

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v6, 0x20

    const/16 v4, 0x10

    const/4 v8, 0x1

    move v3, v6

    move v5, v6

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x3

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yn;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lc;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->a()Lcom/google/android/gms/internal/firebase-auth-api/gj;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->F()Lcom/google/android/gms/internal/firebase-auth-api/fo;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/kc;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/kc;->f(Lcom/google/android/gms/internal/firebase-auth-api/fo;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->a()Lcom/google/android/gms/internal/firebase-auth-api/gj;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->G()Lcom/google/android/gms/internal/firebase-auth-api/yq;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/gj;->d(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->F()Lcom/google/android/gms/internal/firebase-auth-api/fo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->C()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->b(I)V

    return-void
.end method

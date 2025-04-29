.class public final Lcom/google/android/gms/internal/firebase-auth-api/xb;
.super Lcom/google/android/gms/internal/firebase-auth-api/hj;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/fk;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/vb;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/vb;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/vn;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hj;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/fk;)V

    return-void
.end method

.method static bridge synthetic k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/fj;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/fj;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fo;->D()Lcom/google/android/gms/internal/firebase-auth-api/eo;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/io;->D()Lcom/google/android/gms/internal/firebase-auth-api/ho;

    move-result-object p4

    const/16 v0, 0x10

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ho;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ho;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/firebase-auth-api/io;

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/eo;->s(Lcom/google/android/gms/internal/firebase-auth-api/io;)Lcom/google/android/gms/internal/firebase-auth-api/eo;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/eo;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/eo;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/fo;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yq;->D()Lcom/google/android/gms/internal/firebase-auth-api/xq;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/br;->D()Lcom/google/android/gms/internal/firebase-auth-api/ar;

    move-result-object p4

    const/4 v0, 0x5

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ar;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/ar;

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ar;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ar;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/br;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/xq;->s(Lcom/google/android/gms/internal/firebase-auth-api/br;)Lcom/google/android/gms/internal/firebase-auth-api/xq;

    const/16 p3, 0x20

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/xq;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/xq;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/yq;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->C()Lcom/google/android/gms/internal/firebase-auth-api/xn;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->r(Lcom/google/android/gms/internal/firebase-auth-api/fo;)Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->s(Lcom/google/android/gms/internal/firebase-auth-api/yq;)Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/yn;

    invoke-direct {p1, p0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/fj;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/gj;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/yn;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/wb;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/wb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xb;Ljava/lang/Class;)V

    return-object v1
.end method

.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final synthetic c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e5;->a()Lcom/google/android/gms/internal/firebase-auth-api/e5;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->F(Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/e5;)Lcom/google/android/gms/internal/firebase-auth-api/vn;

    move-result-object p1

    return-object p1
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public final bridge synthetic e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->C()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/dv;->c(II)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lc;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->G()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lc;->l(Lcom/google/android/gms/internal/firebase-auth-api/bo;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/dm;->m(Lcom/google/android/gms/internal/firebase-auth-api/vq;)V

    return-void
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

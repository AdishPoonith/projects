.class final Lcom/google/android/gms/internal/firebase-auth-api/vb;
.super Lcom/google/android/gms/internal/firebase-auth-api/fk;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fk;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vn;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/cu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lc;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->G()Lcom/google/android/gms/internal/firebase-auth-api/bo;

    move-result-object v2

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/vu;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->i(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/vu;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object v3

    const-class v4, Lcom/google/android/gms/internal/firebase-auth-api/ta;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->i(Lcom/google/android/gms/internal/firebase-auth-api/w6;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/ta;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vn;->H()Lcom/google/android/gms/internal/firebase-auth-api/vq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/vq;->H()Lcom/google/android/gms/internal/firebase-auth-api/br;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/br;->C()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/vu;Lcom/google/android/gms/internal/firebase-auth-api/ta;I)V

    return-object v0
.end method

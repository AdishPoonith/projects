.class final Lcom/google/android/gms/internal/firebase-auth-api/eb;
.super Lcom/google/android/gms/internal/firebase-auth-api/da;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/db;


# instance fields
.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/lk;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/hj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/lk;Lcom/google/android/gms/internal/firebase-auth-api/hj;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/da;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/hj;Ljava/lang/Class;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->c:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->d:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/vr;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->c:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->c(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->c:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->c:Lcom/google/android/gms/internal/firebase-auth-api/lk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/lk;->k(Lcom/google/android/gms/internal/firebase-auth-api/w6;)Lcom/google/android/gms/internal/firebase-auth-api/w6;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->d:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->e(Lcom/google/android/gms/internal/firebase-auth-api/w6;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->C()Lcom/google/android/gms/internal/firebase-auth-api/sr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->d:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sr;->s(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sr;

    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/w6;->zzo()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sr;->t(Lcom/google/android/gms/internal/firebase-auth-api/m4;)Lcom/google/android/gms/internal/firebase-auth-api/sr;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/eb;->d:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hj;->b()Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sr;->r(Lcom/google/android/gms/internal/firebase-auth-api/ur;)Lcom/google/android/gms/internal/firebase-auth-api/sr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o5;->j()Lcom/google/android/gms/internal/firebase-auth-api/r5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/vr;
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/z5; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized proto of type "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

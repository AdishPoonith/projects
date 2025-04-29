.class final Lcom/google/android/gms/internal/firebase-auth-api/qc;
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
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/lo;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/rt;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lo;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lo;->G()Lcom/google/android/gms/internal/firebase-auth-api/ro;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ro;->C()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/rt;-><init>([BI)V

    return-object v0
.end method

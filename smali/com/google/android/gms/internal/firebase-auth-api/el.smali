.class final Lcom/google/android/gms/internal/firebase-auth-api/el;
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
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mn;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zu;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/wu;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mn;->H()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/wu;-><init>([B)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mn;->G()Lcom/google/android/gms/internal/firebase-auth-api/sn;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sn;->C()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zu;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/jn;I)V

    return-object v0
.end method

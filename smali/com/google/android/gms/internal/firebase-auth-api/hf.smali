.class final Lcom/google/android/gms/internal/firebase-auth-api/hf;
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
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jt;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jt;->G()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;->z()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fv;-><init>([B)V

    return-object v0
.end method

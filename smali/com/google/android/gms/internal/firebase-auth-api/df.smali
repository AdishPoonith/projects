.class final Lcom/google/android/gms/internal/firebase-auth-api/df;
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

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xs;->G()Lcom/google/android/gms/internal/firebase-auth-api/at;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/at;->G()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sa;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/ra;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ra;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/s9;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/cf;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xs;->G()Lcom/google/android/gms/internal/firebase-auth-api/at;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/at;->C()Lcom/google/android/gms/internal/firebase-auth-api/as;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cf;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/as;Lcom/google/android/gms/internal/firebase-auth-api/s9;)V

    return-object v1
.end method

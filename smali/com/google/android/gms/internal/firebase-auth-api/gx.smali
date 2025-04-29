.class final Lcom/google/android/gms/internal/firebase-auth-api/gx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/o0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/hx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/hx;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/gx;->b:Lcom/google/android/gms/internal/firebase-auth-api/hx;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/gx;->a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/gx;->a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/n0;->zza(Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/gx;->b:Lcom/google/android/gms/internal/firebase-auth-api/hx;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/hx;->a:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/g;->d()V

    return-void
.end method

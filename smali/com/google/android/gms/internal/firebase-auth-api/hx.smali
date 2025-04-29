.class final Lcom/google/android/gms/internal/firebase-auth-api/hx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/o0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/g;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/rx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/rx;Lcom/google/android/gms/internal/firebase-auth-api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hx;->b:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/hx;->a:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La6/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hx;->a:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/j2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/o1;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o1;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hx;->b:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->s(Lcom/google/android/gms/internal/firebase-auth-api/rx;)Lcom/google/android/gms/internal/firebase-auth-api/p0;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/gx;

    invoke-direct {v1, p0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/gx;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/hx;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->b(Lcom/google/android/gms/internal/firebase-auth-api/o1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V

    return-void
.end method

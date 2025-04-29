.class public final synthetic Lcom/google/android/gms/internal/auth/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/u0;


# instance fields
.field public final synthetic j:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/d0;->j:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/d0;->j:Landroid/content/Context;

    sget v1, Lcom/google/android/gms/internal/auth/n0;->l:I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/z;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/s0;

    move-result-object v0

    return-object v0
.end method

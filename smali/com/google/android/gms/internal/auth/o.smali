.class public final synthetic Lcom/google/android/gms/internal/auth/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/u;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/auth/q;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/auth/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/o;->a:Lcom/google/android/gms/internal/auth/q;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/o;->a:Lcom/google/android/gms/internal/auth/q;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/q;->c()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.class public final synthetic Lu8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu8/t0;

.field public final synthetic k:Ljava/util/Map;

.field public final synthetic l:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lu8/t0;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/o;->j:Lu8/t0;

    iput-object p2, p0, Lu8/o;->k:Ljava/util/Map;

    iput-object p3, p0, Lu8/o;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu8/o;->j:Lu8/t0;

    iget-object v1, p0, Lu8/o;->k:Ljava/util/Map;

    iget-object v2, p0, Lu8/o;->l:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lu8/t0;->w(Lu8/t0;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

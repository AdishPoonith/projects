.class public final synthetic Lv8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lv8/w;

.field public final synthetic k:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lv8/w;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv8/h;->j:Lv8/w;

    iput-object p2, p0, Lv8/h;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv8/h;->j:Lv8/w;

    iget-object v1, p0, Lv8/h;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lv8/w;->r(Lv8/w;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.class public final synthetic Lu8/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lu8/v0$i;


# direct methods
.method public synthetic constructor <init>(Lu8/v0$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/j0;->a:Lu8/v0$i;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lu8/j0;->a:Lu8/v0$i;

    invoke-static {v0, p1}, Lu8/t0;->l(Lu8/v0$i;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

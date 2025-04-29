.class public final synthetic La9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:La9/l$a;


# direct methods
.method public synthetic constructor <init>(La9/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/h;->a:La9/l$a;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, La9/h;->a:La9/l$a;

    invoke-static {v0, p1}, La9/l$a;->e(La9/l$a;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

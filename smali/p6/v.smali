.class public final synthetic Lp6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lp6/w;

.field public final synthetic b:[Li9/g;

.field public final synthetic c:Lp6/h0;


# direct methods
.method public synthetic constructor <init>(Lp6/w;[Li9/g;Lp6/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/v;->a:Lp6/w;

    iput-object p2, p0, Lp6/v;->b:[Li9/g;

    iput-object p3, p0, Lp6/v;->c:Lp6/h0;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lp6/v;->a:Lp6/w;

    iget-object v1, p0, Lp6/v;->b:[Li9/g;

    iget-object v2, p0, Lp6/v;->c:Lp6/h0;

    invoke-static {v0, v1, v2, p1}, Lp6/w;->b(Lp6/w;[Li9/g;Lp6/h0;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

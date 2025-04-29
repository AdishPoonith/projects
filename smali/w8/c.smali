.class public final synthetic Lw8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lw8/e;

.field public final synthetic b:Lr8/d$b;


# direct methods
.method public synthetic constructor <init>(Lw8/e;Lr8/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/c;->a:Lw8/e;

    iput-object p2, p0, Lw8/c;->b:Lr8/d$b;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lw8/c;->a:Lw8/e;

    iget-object v1, p0, Lw8/c;->b:Lr8/d$b;

    invoke-static {v0, v1, p1}, Lw8/e;->d(Lw8/e;Lr8/d$b;Ljava/lang/Exception;)V

    return-void
.end method

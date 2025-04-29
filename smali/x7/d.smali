.class public final synthetic Lx7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lcom/lyokone/location/a;

.field public final synthetic b:Lr8/k$d;


# direct methods
.method public synthetic constructor <init>(Lcom/lyokone/location/a;Lr8/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/d;->a:Lcom/lyokone/location/a;

    iput-object p2, p0, Lx7/d;->b:Lr8/k$d;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lx7/d;->a:Lcom/lyokone/location/a;

    iget-object v1, p0, Lx7/d;->b:Lr8/k$d;

    invoke-static {v0, v1, p1}, Lcom/lyokone/location/a;->c(Lcom/lyokone/location/a;Lr8/k$d;Ljava/lang/Exception;)V

    return-void
.end method

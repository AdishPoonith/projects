.class public final synthetic Lx7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lcom/lyokone/location/a;


# direct methods
.method public synthetic constructor <init>(Lcom/lyokone/location/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/c;->a:Lcom/lyokone/location/a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lx7/c;->a:Lcom/lyokone/location/a;

    invoke-static {v0, p1}, Lcom/lyokone/location/a;->d(Lcom/lyokone/location/a;Ljava/lang/Exception;)V

    return-void
.end method

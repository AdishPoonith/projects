.class public final synthetic Lx7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic a:Lcom/lyokone/location/a;


# direct methods
.method public synthetic constructor <init>(Lcom/lyokone/location/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/e;->a:Lcom/lyokone/location/a;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx7/e;->a:Lcom/lyokone/location/a;

    check-cast p1, Lt4/g;

    invoke-static {v0, p1}, Lcom/lyokone/location/a;->a(Lcom/lyokone/location/a;Lt4/g;)V

    return-void
.end method

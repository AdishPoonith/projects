.class public final synthetic Lx7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/location/OnNmeaMessageListener;


# instance fields
.field public final synthetic a:Lcom/lyokone/location/a;


# direct methods
.method public synthetic constructor <init>(Lcom/lyokone/location/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/b;->a:Lcom/lyokone/location/a;

    return-void
.end method


# virtual methods
.method public final onNmeaMessage(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lx7/b;->a:Lcom/lyokone/location/a;

    invoke-static {v0, p1, p2, p3}, Lcom/lyokone/location/a;->e(Lcom/lyokone/location/a;Ljava/lang/String;J)V

    return-void
.end method

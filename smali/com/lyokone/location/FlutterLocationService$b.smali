.class public final Lcom/lyokone/location/FlutterLocationService$b;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lyokone/location/FlutterLocationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/lyokone/location/FlutterLocationService;


# direct methods
.method public constructor <init>(Lcom/lyokone/location/FlutterLocationService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/lyokone/location/FlutterLocationService$b;->a:Lcom/lyokone/location/FlutterLocationService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/lyokone/location/FlutterLocationService;
    .locals 1

    iget-object v0, p0, Lcom/lyokone/location/FlutterLocationService$b;->a:Lcom/lyokone/location/FlutterLocationService;

    return-object v0
.end method

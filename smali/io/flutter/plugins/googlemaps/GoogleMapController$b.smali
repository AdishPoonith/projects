.class Lio/flutter/plugins/googlemaps/GoogleMapController$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu4/c$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/googlemaps/GoogleMapController;->I(Lr8/j;Lr8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr8/k$d;

.field final synthetic b:Lio/flutter/plugins/googlemaps/GoogleMapController;


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemaps/GoogleMapController;Lr8/k$d;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController$b;->b:Lio/flutter/plugins/googlemaps/GoogleMapController;

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/GoogleMapController$b;->a:Lr8/k$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/GoogleMapController$b;->a:Lr8/k$d;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.class final Ll0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;


# instance fields
.field private final j:Ll0/a;

.field private k:Lr8/k;


# direct methods
.method constructor <init>(Ll0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/c;->j:Ll0/a;

    return-void
.end method

.method private a(Lr8/j;Lr8/k$d;)V
    .locals 6

    const-string v0, "address"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "localeIdentifier"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const-string v2, "ARGUMENT_ERROR"

    const-string v3, "Supply a valid value for the \'address\' parameter."

    invoke-interface {p2, v2, v3, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x1

    :try_start_0
    iget-object v4, p0, Ll0/c;->j:Ll0/a;

    invoke-static {p1}, Lm0/c;->a(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {v4, v0, p1}, Ll0/a;->b(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lm0/b;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_0
    const-string p1, "NOT_FOUND"

    const-string v4, "No coordinates found for \'%s\'"

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v0, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, p1, v4, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-array p1, v3, [Ljava/lang/Object;

    aput-object v0, p1, v2

    const-string v0, "A network error occurred trying to lookup the address \'\'."

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "IO_ERROR"

    invoke-interface {p2, v0, p1, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private b(Lr8/j;Lr8/k$d;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "latitude"

    invoke-virtual {v0, v2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    const-string v2, "longitude"

    invoke-virtual {v0, v2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v11

    const-string v2, "localeIdentifier"

    invoke-virtual {v0, v2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x2

    move-object/from16 v8, p0

    :try_start_0
    iget-object v3, v8, Ll0/c;->j:Ll0/a;

    invoke-static {v0}, Lm0/c;->a(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    move-wide v4, v9

    move-wide v6, v11

    move-object v8, v0

    invoke-virtual/range {v3 .. v8}, Ll0/a;->c(DDLjava/util/Locale;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lm0/b;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, "NOT_FOUND"

    const-string v3, "No address information found for supplied coordinates (latitude: %f, longitude: %f)."

    new-array v4, v15, [Ljava/lang/Object;

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v4, v14

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    aput-object v5, v4, v13

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v3, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-array v0, v15, [Ljava/lang/Object;

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v0, v14

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v0, v13

    const-string v3, "A network error occurred trying to lookup the supplied coordinates (latitude: %f, longitude: %f)."

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "IO_ERROR"

    invoke-interface {v1, v3, v0, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 2

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "placemarkFromCoordinates"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "locationFromAddress"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Ll0/c;->a(Lr8/j;Lr8/k$d;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2}, Ll0/c;->b(Lr8/j;Lr8/k$d;)V

    :goto_0
    return-void
.end method

.method c(Lr8/c;)V
    .locals 4

    iget-object v0, p0, Ll0/c;->k:Lr8/k;

    if-eqz v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Setting a method call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ll0/c;->d()V

    :cond_0
    invoke-interface {p1}, Lr8/c;->d()Lr8/c$c;

    move-result-object v0

    new-instance v1, Lr8/k;

    sget-object v2, Lr8/s;->b:Lr8/s;

    const-string v3, "flutter.baseflow.com/geocoding"

    invoke-direct {v1, p1, v3, v2, v0}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;Lr8/l;Lr8/c$c;)V

    iput-object v1, p0, Ll0/c;->k:Lr8/k;

    invoke-virtual {v1, p0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Ll0/c;->k:Lr8/k;

    if-nez v0, :cond_0

    const-string v0, "MethodCallHandlerImpl"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr8/k;->e(Lr8/k$c;)V

    iput-object v1, p0, Ll0/c;->k:Lr8/k;

    return-void
.end method
